package com.zhs.service;

import com.zhs.model.Reward;
import com.zhs.utils.DataMap;

/**
 * @author: 张浩晟
 * @Date: 2021/7/14 15:44
 * Describe:
 */
public interface RewardService {

    DataMap save(Reward reward);
    /**
     * 获得所有的募捐记录
     * @return
     */
    DataMap getRewardInfo();

    /**
     * 通过id删除募捐记录
     */
    DataMap deleteReward(int id);
}
