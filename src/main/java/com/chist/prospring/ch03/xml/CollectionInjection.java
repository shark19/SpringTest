package com.chist.prospring.ch03.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {

    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/ch03/app-context-xml.xml");
            ctx.refresh();
            CollectionInjection instance = (CollectionInjection) ctx.getBean("injectCollection");
            System.out.println(instance);
        }
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
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