package com.zhs.service;

import com.zhs.model.DailySpeech;
import com.zhs.utils.DataMap;

/**
 * @author: 张浩晟
 * @Date: 2018/11/28 15:33
 * Describe: 藏心阁-今日
 */
public interface TodayService {

    DataMap publishISay(DailySpeech dailySpeech);

    DataMap getTodayInfo(int rows, int pageNum);

}
