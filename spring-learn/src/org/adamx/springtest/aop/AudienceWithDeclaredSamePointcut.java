package org.adamx.springtest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author shangzhidong@zhuanzhuan.com
 * @date 2018-07-05 21:08
 */
@Component
@Aspect
public class AudienceWithDeclaredSamePointcut {

    @Pointcut("execution(* org.adamx.springtest.aop.Performance.perform(..))")
    public void performPointcut() {}
    @Before("performPointcut()")
    public void silenceCellPhones() {
        System.out.println("XX>>> Silencing cell phones");
    }

    @Before("performPointcut()")
    public void takeSeats() {
        System.out.println("XX>>> Taking seats");
    }

    @AfterReturning("performPointcut()")
    public void applause() {
        System.out.println("XX>>> CLAP CLAP CLAP !!!");
    }

    @AfterThrowing("performPointcut()")
    public void demandRefund() {
        System.out.println("XX>>> Demanding a refund");
    }

//    @Around("performPointcut()")
//    public void watchPerformance(ProceedingJoinPoint joinPoint) {
//        try {
//            System.out.println("1111 Silencing cell phones");
//            System.out.println("1111 Taking seats");
//            joinPoint.proceed();
//            System.out.println("1111 CLAP CLAP CLAP !!!");
//        } catch (Throwable throwable) {
//            System.out.println("1111 Demanding a refund");
//        }
//    }
}
