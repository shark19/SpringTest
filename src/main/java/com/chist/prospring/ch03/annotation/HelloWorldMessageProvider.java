package com.chist.prospring.ch03.annotation;

import com.chist.prospring.ch02.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello world!!";
    }
}
