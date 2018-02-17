package com.chist.prospring.ch03.xml;

import com.chist.prospring.ch03.ContentHolder;

public class LyricHolder implements ContentHolder {

    private String value = "'You be the DJ, I'll be the driver'";

    @Override
    public String toString() {
        return "LyricHolder{" +
                "value='" + value + '\'' +
                '}';
    }
}
