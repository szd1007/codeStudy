package com.adamx.springtest;

/**
 * Created by zm on 2016/8/7.
 */
public class Juggler implements Performer {
    private int beanBags = 3;
    public  Juggler(){}
    public  Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public  void perform(){
        System.out.println("JUGGLING "+beanBags+" beanbags");
    }
}