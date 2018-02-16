package com.chist.prospring.ch03.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/configurable-annotated.xml");
            ctx.refresh();
            Singer singer = ctx.getBean(Singer.class);
            singer.sing();
        }
    }
}
