package com.adamx.springtest;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * Created by zm on 2016/8/7.
 */
public class Saxophone implements Instrument {
    public Saxophone(){}


    public void play() {
        System.out.println("TOOT TOOOT TOOT");
    }
}
