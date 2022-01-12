package com.zhs.controller;

import com.zhs.constant.CodeType;
import com.zhs.service.ArticleService;
import com.zhs.utils.DataMap;
import com.zhs.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张浩晟
 * @Date: 2018/7/23 11:44
 * Describe:
 */
@RestController
@Slf4j
public class MyStoryControl {

    private static final String CATEGORY = "我的故事";

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/getMyStory", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getMyStory(@RequestParam("rows") int rows,
                                 @RequestParam("pageNum") int pageNum){
        try {
            DataMap data = articleService.findArticleByCategory(CATEGORY, rows, pageNum);
            return JsonResult.build(data).toJSON();
        } catch (Exception e){
            log.error("Get myStory exception", e);
        }
        return JsonResult.fail(CodeType.SERVER_EXCEPTION).toJSON();
    }

}
