package com.adamx.springmvc.data.impl;

import com.adamx.springmvc.Spittle;
import com.adamx.springmvc.data.SpittleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shangzhidong on 2016/8/24.
 */
public class SpittleResposityImpl implements SpittleRepository {
    @Override
    public Spittle findOne(long spittleId) {
        return new Spittle("spittle one ",new Date());
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return createSpittleList(count);
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
