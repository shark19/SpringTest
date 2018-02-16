package com.chist.prospring.ch03.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    @Value("John Mayer")
    private String name;
    @Value("39")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("1241401112")
    private Long ageInSeconds;

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/configurable-annotated.xml");
            ctx.refresh();
            InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple");
            System.out.println(injectSimple);
        }
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }
}
