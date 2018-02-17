package com.chist.prospring.ch03.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollection")
public class CollectionInjection {

    @Resource(name="map")
    private Map<String, Object> map;

    @Resource(name="props")
    private Properties props;

    @Resource(name="set")
    private Set set;

    @Resource(name="list")
    private List list;

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/configurable-annotated.xml");
            ctx.refresh();
            CollectionInjection injection = (CollectionInjection) ctx.getBean("injectCollection");
            System.out.println(injection);
        }
    }

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "map=" + map +
                ", props=" + props +
                ", set=" + set +
                ", list=" + list +
                '}';
    }
}
