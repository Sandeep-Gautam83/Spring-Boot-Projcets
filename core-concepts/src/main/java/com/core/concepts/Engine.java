package com.core.concepts;


import org.springframework.stereotype.Component;

@Component(value = "engine1")
public class Engine
{
    public void startEngine(){
        System.out.println("engine started..");
    }

}
