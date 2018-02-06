package com.chist.prospring.ch03.mixed;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:spring/ch02/app-context.xml"})
@Configuration
public class HelloWorldConfiguration {

}
