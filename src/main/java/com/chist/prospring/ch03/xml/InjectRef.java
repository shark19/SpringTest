package com.chist.prospring.ch03.xml;

import com.chist.prospring.ch03.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-xml.xml");
            ctx.refresh();
            InjectRef injectRef = (InjectRef) ctx.getBean("injectRef");
            System.out.println(injectRef);
        }
    }

    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
