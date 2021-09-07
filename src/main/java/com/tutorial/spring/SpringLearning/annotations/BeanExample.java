package com.tutorial.spring.SpringLearning.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 1. Spring scans the package
 * 2. then spring understands the classes which are annotated with @Component, @Service, @Controller, @Repository are beans
 * 3. then these class beans stores in Spring IOC container
 *
 * Specify bean name externally - @Component("<bean_name>")
 * if we don't mention explicitly any bean name then default bean name will be Class name with first letter as small
 */
@Component("beanExample")
@PropertySource("classpath:sample.properties")
public class BeanExample {

    @Value("Sample")
    public String sampleValue;

   // @Value("${sample.value}")
    //public String sampleValueInProperties;


    public void getSampleValue() {
        System.out.println(sampleValue);
        //System.out.println(sampleValueInProperties);
    }
}
