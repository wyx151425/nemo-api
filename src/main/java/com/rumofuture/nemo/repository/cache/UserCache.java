package com.rumofuture.nemo.repository.cache;

import com.alibaba.fastjson.JSON;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.util.constant.NemoConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  王振琦  2018/1/2
 */
@Repository(value = "userCache")
public class UserCache {

    private static final String USER = NemoConst.USER + NemoConst.Cache.SEPARATOR;
    private static final String TOKEN = NemoConst.TOKEN + NemoConst.Cache.SEPARATOR;

    @Autowired
    private NemoCache nemoCache;

    public void setOne(User user) {
        String key = USER + user.getId();
        String value = JSON.toJSONString(user);
        nemoCache.set(key, value);
    }

    public User getOne(Integer id) {
        String key = USER + id;
        String value = nemoCache.get(key);
        return JSON.parseObject(value, User.class);
    }

    public Boolean deleteOne(Integer id) {
        String key = USER + id;
        return nemoCache.delete(key);
    }

    public void setToken(String token, Integer id) {
        String key = TOKEN + token;
        nemoCache.set(key, String.valueOf(id));
    }

    public Integer getToken(String token) {
        String key = TOKEN + token;
        return Integer.valueOf(nemoCache.get(key));
    }
}
