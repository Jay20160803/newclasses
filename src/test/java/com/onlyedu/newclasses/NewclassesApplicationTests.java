package com.onlyedu.newclasses;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewclassesApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest(){
        redisTemplate.opsForValue().set("aa","bb");
        String result = (String) redisTemplate.opsForValue().get("aa");
        Assert.assertEquals("bb",result);
    }

}
