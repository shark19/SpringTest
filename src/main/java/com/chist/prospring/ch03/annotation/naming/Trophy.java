package com.chist.prospring.ch03.annotation.naming;

import org.springframework.core.annotation.AliasFor;

@Award
public @interface Trophy {

    @AliasFor(annotation = Award.class, attribute = "value")
    String[] name() default {};
}