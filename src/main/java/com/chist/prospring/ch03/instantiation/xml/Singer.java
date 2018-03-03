package com.chist.prospring.ch03.instantiation.xml;

public class Singer {

    private String name = "unknown";

    public Singer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                '}';
    }
}