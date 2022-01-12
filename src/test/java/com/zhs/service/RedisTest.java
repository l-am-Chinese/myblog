package com.zhs.service;

import com.zhs.mapper.VisitorMapper;
import com.zhs.redis.HashRedisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: 张浩晟
 * @Date: 2021/5/6 14:30
 * Describe:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    HashRedisServiceImpl hashRedisService;
    @Autowired
    VisitorMapper visitorMapper;

    @Test
    public void redisTest(){
    }

}
