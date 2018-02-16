package com.chist.prospring.ch03.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfig.name}")
    private String name;
    @Value("#{injectSimpleConfig.age + 2}")
    private int age;
    @Value("#{injectSimpleConfig.height}")
    private float height;
    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return "InjectSimpleSpel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/configurable-annotated.xml");
            ctx.refresh();
            InjectSimpleSpel spel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
            System.out.println(spel);
        }
    }
}
