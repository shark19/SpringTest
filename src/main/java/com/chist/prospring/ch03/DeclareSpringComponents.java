package com.chist.prospring.ch03;

import com.chist.prospring.ch02.decoupled.MessageProvider;
import com.chist.prospring.ch02.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    private static final String CLASSPATH = "classpath:";

    private static final String XML_PATH = CLASSPATH
            .concat("spring/ch02/app-context.xml");

    private static final String ANNOTATIONS_PATH = CLASSPATH
            .concat("spring/ch03/app-context-annotation.xml");

    private static final String CONFIGURABLE_XML_PATH = CLASSPATH
            .concat("spring/ch03/configurable-message-provider-xml.xml");

    private static final String CONFIGURABLE_ANNOTATION_PATH = CLASSPATH
            .concat("spring/ch03/configurable-message-provider-annotated.xml");

    public static void main(String[] args) {
        //declare();
        declare2();
    }

    private static void declare() {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()){
            ctx.load(ANNOTATIONS_PATH);
            ctx.refresh();
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();
        }
    }

    private static void declare2() {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()){
            ctx.load(CONFIGURABLE_ANNOTATION_PATH);
            ctx.refresh();
            MessageProvider mp = ctx.getBean("provider",MessageProvider.class);
            System.out.println(mp.getMessage());
        }
    }
}
