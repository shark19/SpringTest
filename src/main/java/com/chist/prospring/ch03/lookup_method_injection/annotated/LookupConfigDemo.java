package com.chist.prospring.ch03.lookup_method_injection.annotated;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupConfigDemo {

    @Configuration
    @ComponentScan(basePackages = {"com.chist.prospring.ch03.lookup_method_injection.annotated"})
    public static class LookupConfig{}

    public static void main(String[] args) {
        try (GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LookupConfig.class)) {
            DemoBean abstractBean = ctx.getBean("abstractLookupBean", AbstractLookupDemoBean.class);
            DemoBean standardBean = ctx.getBean("standardLookupBean", StandardLookupDemoBean.class);
            displayInfo("abstractLookupBean", abstractBean);
            displayInfo("standardLookupBean", standardBean);
        }
    }

    private static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
        System.out.println("" + beanName + ": Singer Instances the same? " +
                (singer1 == singer2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++){
            bean.getMySinger().sing();
        }
        stopWatch.stop();
        System.out.println("100000 get took " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
