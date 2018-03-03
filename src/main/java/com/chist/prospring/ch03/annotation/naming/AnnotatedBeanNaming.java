package com.chist.prospring.ch03.annotation.naming;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/annotation-naming.xml");
            ctx.refresh();
            Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
            beans.forEach((k, v) -> System.out.println("id: " + k));
        }
    }
}
