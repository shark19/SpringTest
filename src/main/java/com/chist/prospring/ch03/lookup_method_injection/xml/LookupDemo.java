package com.chist.prospring.ch03.lookup_method_injection.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-xml.xml");
            ctx.refresh();
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
