package com.zhs.mapper;

import com.zhs.model.FeedBack;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 张浩晟
 * @Date: 2018/7/23 17:22
 * Describe: 反馈sql
 */
@Mapper
@Repository
public interface FeedBackMapper {

    @Insert("insert into feedback(feedbackContent,contactInfo,personId,feedbackDate) values(#{feedbackContent},#{contactInfo},#{personId},#{feedbackDate})")
    void save(FeedBack feedBack);

    @Select("select * from feedback order by id desc")
    List<FeedBack> getAllFeedback();

}
