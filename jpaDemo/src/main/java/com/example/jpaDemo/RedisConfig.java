package com.example.jpaDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfig {

	
	   @Bean
	    public RedisConnectionFactory redisConnectionFactory() {
	        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
	        jedisConnectionFactory.setHostName("localhost");
	        jedisConnectionFactory.setPort(6379);
	        return jedisConnectionFactory;
	    }
	   
	   
	   @Bean
	    public RedisTemplate<String, Object> redisTemplate() {
	        RedisTemplate<String, Object> template = new RedisTemplate<>();
	        template.setConnectionFactory(redisConnectionFactory());
	        template.setKeySerializer(new StringRedisSerializer());
	        template.setValueSerializer(new StringRedisSerializer()); // Customize this based on your data types
	        return template;
	    }
}
