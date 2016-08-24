package com.adamx.springmvc.data;

import com.adamx.springmvc.Spittle;

import java.util.List;

/**
 * Created by shangzhidong on 2016/8/22.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
}
