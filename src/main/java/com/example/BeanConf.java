package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConf {
    @Bean
    @Scope("prototype")
    MessageService messageServiceRandom() {
        return new RandomTextMessageService();
    }

    @Bean
    MessageService messageService() {
        return new MyNameMessageService();
    }
}
