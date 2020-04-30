package com.training;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.training.util.BinarySearchImpl;
import com.training.util.BubleSortAlgorithm;
import com.training.util.QuickSortAlgorithm;

@SpringBootApplication
public class TrainingApplication extends SpringBootServletInitializer  {
	
	public static void main(String[] args) {

//		Tightly couple 
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubleSortAlgorithm());
//		int result=binarySearch.binarySeach(new int [] {1,3,5423,34,234}, 1);
//		System.out.println(result);
		
//		SpringApplication.run(TrainingApplication.class, args);
		
		//Loosely couple
		ApplicationContext context = SpringApplication.run(TrainingApplication.class, args);
		BinarySearchImpl binarySearch= context.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySeach(new int [] {1,3,5423,34,234}, 1);
		System.out.println(result);
	}
}
