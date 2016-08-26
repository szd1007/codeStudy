package com.adamx.springmvc.data.impl;

import com.adamx.springmvc.Spitter;
import com.adamx.springmvc.data.SpitterRepository;

/**
 * Created by shangzhidong on 2016/8/25.
 */
public class SpitterResposityImpl implements SpitterRepository {
    @Override
    public Spitter findByUsername(String username) {
        Spitter s = new Spitter();
        s.setUsername(username);
        s.setFirstName("firstname");
        s.setEmail("szd1007@163.com");
        return s;
    }

    @Override
    public Spitter save(Spitter spitter) {
        return spitter;
    }
}
