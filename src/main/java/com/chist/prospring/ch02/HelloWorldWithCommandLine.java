package com.chist.prospring.ch02;

public class HelloWorldWithCommandLine {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello world!!!");
        }
    }
}
