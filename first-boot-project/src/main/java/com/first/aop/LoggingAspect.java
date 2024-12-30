package com.first.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {

    // execution(<modifier-pattern> <return-type-pattern> <declaring-type-pattern>.<method-name-pattern>(<parameter-pattern))

    // Cross-cutting concern - Before advice
    @Before("execution(* com.first.services.ProductService.*(..))")
    public void greeting() {
        System.out.println("hi method starting...");
    }

    // Cross-cutting concern - After advice
    @After("execution(* com.first.services.ProductService.*(..))")
    public void byeBye() {
        System.out.println("bye bye, terminating method");
    }
}
