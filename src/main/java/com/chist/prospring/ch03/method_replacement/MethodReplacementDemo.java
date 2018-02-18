package com.chist.prospring.ch03.method_replacement;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {

    public static void main(String[] args) {
        try(GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-xml.xml");
            ctx.refresh();
            ReplacementTarget replacementTarget = ctx.getBean("replacementTarget", ReplacementTarget.class);
            ReplacementTarget standardTarget = ctx.getBean("standardTarget", ReplacementTarget.class);
            displayInfo(replacementTarget);
            displayInfo(standardTarget);
        }
    }

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Thanks for playing, try again!"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for (int i = 0; i < 100000; i++) {
            String out = target.formatMessage("No filter in my head");
        }
        stopWatch.stop();
        System.out.println("100000 invocations took: " + stopWatch.getTotalTimeMillis() +
        " ms");
    }
}
