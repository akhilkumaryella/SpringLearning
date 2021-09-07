package com.tutorial.spring.SpringLearning.annotations;

import javax.annotation.PostConstruct;

/**
 * Instead of annotations(Component,Service etc), we can create beans by using @Bean annotation
 * check BeanConfiguration class
 */
public class BeanExampleWithoutAnnotation {

    public void test() {
        System.out.println("BeanExampleWithoutAnnotation...");
    }

    @PostConstruct
    public void postconstruct() {
        System.out.println("sample test ::" +this);
    }
}
