package com.nicholas.fastmedicineserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.Controller;

import com.nicholas.fastmedicineserver.CashcreditApplication;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(CashcreditApplication.class);
	}

}
