package com.example.jpaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.jpaDemo.controller.ExternalApiCall;

@SpringBootApplication
@EnableCaching
public class JpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(JpaDemoApplication.class,
				args);

		ExternalApiCall externalApiCall = (ExternalApiCall) configurableApplicationContext.getBean("ExternalApiCall");
		externalApiCall.display();

//		double d = 1024 * 1024;
//		Runtime run = Runtime.getRuntime();
//		System.out.println("Maximum memory : " + run.maxMemory() / d);
//		System.out.println("Initial allocation memory : " + run.totalMemory() / d);
//		System.out.println("Free memory from initial allocation memory : " + run.freeMemory() / d);
//		System.out.println("Consumed memory from initial allocation memory : "
//				+ ((run.totalMemory() / d) - (run.freeMemory() / d)));
	}

//  Jpa Full
//  External Api Call
//  heap memory

//  bean lyfe cycle 

//  ContainerStarted -> BeanInstantiated -> DependenciesInjected -> CustomInitMethod() -> CustomUtilityMethod() -> CustomDestroyMethod() 

}
