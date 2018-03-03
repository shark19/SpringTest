package com.chist.prospring.ch03.dependencies.annotation;

import org.springframework.stereotype.Component;

@Component("gopher")
public class Guitar {

    public void sing() {
        System.out.println("Cm, Am, Dm, G");
    }
}
