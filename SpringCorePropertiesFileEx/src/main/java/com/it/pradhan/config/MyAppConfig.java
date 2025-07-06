package com.it.pradhan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@ComponentScan(basePackages="com.it.pradhan")
@PropertySource("classpath:myapp.properties")
public class MyAppConfig {

}
