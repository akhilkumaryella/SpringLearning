package com.tutorial.spring.SpringLearning.configuration;

import com.tutorial.spring.SpringLearning.annotations.BeanExampleWithoutAnnotation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

/**
 * spring understands classes which are annotated with @Configuration are configuration classes
 */
@Configuration
public class BeanConfiguration {

    // we can create bean by using like this
    // here we are creating BeanExampleWithoutAnnotation class bean
    // when spring application starts, it executes automatically with @Bean annotated methods
    // method name is default bean name/id
    // to override this default bean we have to mention custom bean name like this - @Bean(name = "<bean_name>")
    // here two beans which refers to the same class - BeanExampleWithoutAnnotation
    // in this case if we don't mention which is primary then it will throw error
    @Bean
    @Primary
    public BeanExampleWithoutAnnotation beanExampleWithoutAnnotation() {
        return new BeanExampleWithoutAnnotation();
    }

    @Bean(name = "custombeanname")
    public BeanExampleWithoutAnnotation beanExampleWithoutAnnotation1() {
        return new BeanExampleWithoutAnnotation();
    }



}
