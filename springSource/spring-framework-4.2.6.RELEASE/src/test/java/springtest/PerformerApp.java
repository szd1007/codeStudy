package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by zm on 2016/8/7.
 */
public class PerformerApp {


    public static void main(String args[]){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:performer.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Performer saxPer = (Performer) ctx.getBean("kenny");
        saxPer.perform();
        System.out.println("hello git world");
    }
}
