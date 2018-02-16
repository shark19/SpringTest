package com.chist.prospring.ch03.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {

    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + someValue;
    }

    @Override
    public String toString() {
        return someValue;
    }

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/configurable-xml.xml");
            ctx.refresh();
            ConstructorConfusion cc  = (ConstructorConfusion) ctx.getBean("constructorConfusion");
            System.out.println(cc);
        }
    }
}
