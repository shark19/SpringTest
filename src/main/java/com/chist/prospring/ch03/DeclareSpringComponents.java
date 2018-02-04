package com.chist.prospring.ch03;

import com.chist.prospring.ch02.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    private static final String CLASSPATH = "classpath:";

    private static final String XML_PATH = CLASSPATH
            .concat("spring/ch02/app-context.xml");

    private static final String ANNOTATIONS_PATH = CLASSPATH
            .concat("spring/ch03/app-context-annotation.xml");

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()){
            ctx.load(ANNOTATIONS_PATH);
            ctx.refresh();
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();
        }
    }
}
