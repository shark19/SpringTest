package com.chist.prospring.ch03.annotation.naming;

import org.springframework.core.annotation.AliasFor;

public @interface Award {

    @AliasFor("prize")
    String[] value() default {};

    @AliasFor("value")
    String[] prize() default {};
}