package com.chist.prospring.ch03;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanCrazyNaming {

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-03.xml");
            ctx.refresh();
            Map<String, String> beans = ctx.getBeansOfType(String.class);
            beans.forEach((key, value) -> {
                System.out.println("id: " + key);
                System.out.println("aliases: " + Arrays.toString(ctx.getAliases(key)));
            });
        }
    }
}
