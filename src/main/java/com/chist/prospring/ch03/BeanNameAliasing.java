package com.chist.prospring.ch03;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNameAliasing {

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-02.xml");
            ctx.refresh();

            String s1 = (String) ctx.getBean("john");
            String s2 = (String) ctx.getBean("jon");
            String s3 = (String) ctx.getBean("johnny");
            String s4 = (String) ctx.getBean("jonathan");
            String s5 = (String) ctx.getBean("jim");
            String s6 = (String) ctx.getBean("ion");

            System.out.println(s1 == s2);
            System.out.println(s2 == s3);
            System.out.println(s3 == s4);
            System.out.println(s4 == s5);
            System.out.println(s5 == s6);

            Map<String, String> beans = ctx.getBeansOfType(String.class);

            if (beans.size() == 1) {
                System.out.println("There is only one String bean.");
            }
        }
    }
}
