package com.chist.prospring.ch02.decoupled;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello world!!!";
    }
}
