package com.zhs.redis;

/**
 * @author: 张浩晟
 * @Date: 2021/5/14 15:31
 * Describe:
 */
public interface RedisService {

    /**
     * 判断key是否存在
     */
    Boolean hasKey(String key);

}
