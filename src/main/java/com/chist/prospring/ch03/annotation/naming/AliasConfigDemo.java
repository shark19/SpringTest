package com.chist.prospring.ch03.annotation.naming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {

        @Bean(name = {"johnMayer", "john", "jonathan", "johnny"})
        public Singer singer() {
            return new Singer();
        }
    }

    public static void main(String[] args) {
        try (GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class)) {
            Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
            beans.forEach((k, v) -> {
                System.out.println("id: " + k);
                System.out.println("aliases: " + Arrays.toString(ctx.getAliases(k)));
            });
        }
    }
}
