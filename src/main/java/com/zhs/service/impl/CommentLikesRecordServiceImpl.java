package com.zhs.service.impl;

import com.zhs.mapper.CommentLikesMapper;
import com.zhs.model.CommentLikesRecord;
import com.zhs.service.CommentLikesRecordService;
import com.zhs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 张浩晟
 * @Date: 2018/7/12 13:47
 * Describe:
 */
@Service
public class CommentLikesRecordServiceImpl implements CommentLikesRecordService {

    @Autowired
    CommentLikesMapper commentLikesMapper;
    @Autowired
    UserService userService;

    @Override
    public boolean isLiked(long articleId, long pId, String username) {
        return commentLikesMapper.isLiked(articleId, pId, userService.findIdByUsername(username)) != null;
    }

    @Override
    public void insertCommentLikesRecord(CommentLikesRecord commentLikesRecord) {
        commentLikesMapper.save(commentLikesRecord);
    }

    @Override
    public void deleteCommentLikesRecordByArticleId(long articleId) {
        commentLikesMapper.deleteCommentLikesRecordByArticleId(articleId);
    }
}
