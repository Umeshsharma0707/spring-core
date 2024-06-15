package com.springcore.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.springcore.practice")
public class JavaConfig {
	
	@Bean(name = {"c","cooler"})
	@Scope("prototype")
	public Cooler getCooler() {
		return new Cooler(getFan());
	}
	
	@Bean
	@Scope("prototype")
	public Fan getFan() {
		return new Fan();
	}
}
