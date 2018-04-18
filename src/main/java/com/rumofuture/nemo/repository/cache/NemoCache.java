package com.rumofuture.nemo.repository.cache;

import javafx.animation.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.keyvalue.repository.KeyValueRepository;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author  王振琦  2017/12/25
 */
@Repository(value = "nemoCache")
public class NemoCache {

    private static final long DEFAULT_TIMEOUT = 24 * 60 * 60;

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value, DEFAULT_TIMEOUT, TimeUnit.SECONDS);
    }

    public void set(String key, String value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public Boolean delete(String key) {
        return redisTemplate.delete(key);
    }
}
