package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConf.class);
        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        MessageService messageService1 = applicationContext.getBean("messageServiceRandom", MessageService.class);

        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());

        System.out.println(messageService.getMessage());

//        applicationContext.close();

    }
}
