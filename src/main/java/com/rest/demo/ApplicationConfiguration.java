package com.rest.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * After implementing our resource and defining the requests and responses of
 * our API, now we need to configure the context url of our API and instruct our
 * servlet container to load the resource on startup. Without this configuration
 * section, your resources wouldn't be exposed to clients.
 * 
 * Spring 4.3.0 supports several configuration annotations, there is no more
 * need to define configurations in web.xml.
 * 
 * this is the configuration class of the application, it is basically used to
 * instruct the servlet container to load REST resources from a specific
 * package.
 * 
 * @author Dushyant_Sahu
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rest.demo")
public class ApplicationConfiguration {

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}
}
