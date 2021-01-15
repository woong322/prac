package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filter.MyCustomPostFilter;
import com.example.filter.MyCustomPreFilter;

@Configuration
public class MyConfig {

	@Bean
	public MyCustomPreFilter awufhawuihh() {
		return new MyCustomPreFilter();
	}
	
	@Bean
	public MyCustomPostFilter asdfuhuh() {
		return new MyCustomPostFilter();
	}
}
