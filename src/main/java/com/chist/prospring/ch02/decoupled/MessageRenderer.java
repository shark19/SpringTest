package com.chist.prospring.ch02.decoupled;

public interface MessageRenderer {

    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
