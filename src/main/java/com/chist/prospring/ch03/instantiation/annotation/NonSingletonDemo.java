package com.chist.prospring.ch03.instantiation.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class NonSingletonDemo {

    public static void main(String[] args) {
        try (GenericApplicationContext ctx = new AnnotationConfigApplicationContext("com.chist.prospring.ch03.instantiation.annotation")) {
            Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
            Singer singer2 = ctx.getBean("nonSingleton", Singer.class);

            System.out.println("Identity Equal?: " + (singer1 == singer2));
            System.out.println("Value Equal?: " + singer1.equals(singer2));
            System.out.println(singer1);
            System.out.println(singer2);
        }
    }
}
