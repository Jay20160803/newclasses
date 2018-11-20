package com.onlyedu.newclasses.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Andy
 * @date 2018/11/20 13:43
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate template(RedisConnectionFactory factory){
        RedisTemplate template = new RedisTemplate();
        template.setConnectionFactory(factory);
        return template;
    }

}
