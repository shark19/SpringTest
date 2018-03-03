package com.chist.prospring.ch03.dependencies.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/dependencies-an.xml");
            ctx.refresh();
            Singer singer = ctx.getBean("johnMayer", Singer.class);
            singer.sing();
        }
    }
}
