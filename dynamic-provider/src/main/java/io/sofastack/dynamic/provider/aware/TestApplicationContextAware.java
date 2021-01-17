package io.sofastack.dynamic.provider.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class TestApplicationContextAware implements ApplicationContextAware {

    @PostConstruct
    public void test(){
        System.out.println("test @Order");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext enter test");
    }
}
