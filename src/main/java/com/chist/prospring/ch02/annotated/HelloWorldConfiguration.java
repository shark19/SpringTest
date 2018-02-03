package com.chist.prospring.ch02.annotated;

import com.chist.prospring.ch02.decoupled.HelloWorldMessageProvider;
import com.chist.prospring.ch02.decoupled.MessageProvider;
import com.chist.prospring.ch02.decoupled.MessageRenderer;
import com.chist.prospring.ch02.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}