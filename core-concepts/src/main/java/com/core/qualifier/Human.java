package com.core.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {

    @Autowired
    @Qualifier("cocaCola") // Injecting the "cocaCola" bean
    ColdDrink coldDrink;

    public void tryColdDrink() {
        coldDrink.drink();
    }

}

