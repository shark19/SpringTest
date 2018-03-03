package com.chist.prospring.ch03.instantiation;

public class Singleton {

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}