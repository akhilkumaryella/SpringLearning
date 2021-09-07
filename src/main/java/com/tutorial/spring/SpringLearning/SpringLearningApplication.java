package com.tutorial.spring.SpringLearning;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tutorial.spring.SpringLearning.annotations.BeanExample;
import com.tutorial.spring.SpringLearning.annotations.BeanExampleWithoutAnnotation;
import com.tutorial.spring.SpringLearning.configuration.BeanConfiguration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
// to disable specific configuration class
//@EnableAutoConfiguration(exclude = {BeanConfiguration.class})
public class SpringLearningApplication implements CommandLineRunner {

	// @Autowired used for injecting
	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// retrieving bean by bean name -
		BeanExample beanExample1 = (BeanExample) applicationContext.getBean("beanExample");
		System.out.println(beanExample1);


		BeanExample beanExample2 = (BeanExample) applicationContext.getBean("beanExample");
		System.out.println(beanExample2);

		// retrieving bean by class
		BeanExample beanExample3 = applicationContext.getBean(BeanExample.class);
		System.out.println(beanExample3);

		BeanExampleWithoutAnnotation beanExampleWithoutAnnotation =
				(BeanExampleWithoutAnnotation) applicationContext.getBean("beanExampleWithoutAnnotation");
		System.out.println(beanExampleWithoutAnnotation);

		BeanExampleWithoutAnnotation beanExampleWithoutAnnotation1 =
				(BeanExampleWithoutAnnotation) applicationContext.getBean("custombeanname");
		System.out.println(beanExampleWithoutAnnotation1);

		BeanExampleWithoutAnnotation beanExampleWithoutAnnotation2 = applicationContext.getBean(BeanExampleWithoutAnnotation.class);
		System.out.println(beanExampleWithoutAnnotation2);
		beanExampleWithoutAnnotation2.test();

		beanExample1.getSampleValue();
	}

	// creating resttemplate bean
//	@Bean
//	public RestTemplate restTemplate () {
//		// setting time outs in resttemplate -
//		HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//		// if service gives response in 3sec, it will give output else gives error
//		httpComponentsClientHttpRequestFactory.setConnectTimeout(3000);
//
//		return new RestTemplate(httpComponentsClientHttpRequestFactory);
//
//	}


}

