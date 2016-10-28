package com.adamx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shangzhidong on 2016/10/10.
 */
public class ApplicationContextTest {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("");
        context.getBean("");

    }
}
