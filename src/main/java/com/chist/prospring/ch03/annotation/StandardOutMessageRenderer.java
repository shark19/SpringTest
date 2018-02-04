package com.chist.prospring.ch03.annotation;

import com.chist.prospring.ch02.decoupled.MessageProvider;
import com.chist.prospring.ch02.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("You must set the property provider of class:" +
                    StandardOutMessageRenderer.class.getName());
        }
        System.out.println(provider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return provider;
    }
}
