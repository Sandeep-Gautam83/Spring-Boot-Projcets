package com.first.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
    @Around("execution(* com.first.controller.*.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        // before
        // time calculate
        long start = System.currentTimeMillis();


        // actual code:execution
        Object result =  joinPoint.proceed();
        System.out.println(result);



        long end = System.currentTimeMillis();
        // after
//        System.out.println("time taken by logic " + (end-start)+" ms");
        System.out.println("time taken by logic "+joinPoint.getSignature()+ " "+ (end-start)+" ms");

        return result;
    }
}
