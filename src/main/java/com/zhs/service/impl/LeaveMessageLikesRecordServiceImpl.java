package com.zhs.service.impl;

import com.zhs.mapper.LeaveMessageLikesRecordMapper;
import com.zhs.model.LeaveMessageLikesRecord;
import com.zhs.service.LeaveMessageLikesRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 张浩晟
 * @Date: 2018/7/16 15:32
 * Describe:
 */
@Service
public class LeaveMessageLikesRecordServiceImpl implements LeaveMessageLikesRecordService {

    @Autowired
    LeaveMessageLikesRecordMapper leaveMessageLikesRecordMapper;


    @Override
    public boolean isLiked(String pageName, int pId, int likeId) {

        return leaveMessageLikesRecordMapper.isLiked(pageName, pId, likeId) != null;
    }

    @Override
    public void insertLeaveMessageLikesRecord(LeaveMessageLikesRecord leaveMessageLikesRecord) {
        leaveMessageLikesRecordMapper.save(leaveMessageLikesRecord);
    }
}
