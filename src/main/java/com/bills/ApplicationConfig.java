package com.bills;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan(basePackages="com.bills")

public class ApplicationConfig {

	
		@Bean
		public MongoDbFactory mongoDbFactory() throws Exception {
			return new SimpleMongoDbFactory(new MongoClient(),"test");
		}

		public @Bean
		MongoTemplate mongoTemplate() throws Exception {
			
			MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
					
			return mongoTemplate;
			
		}

		

		
	}

	

