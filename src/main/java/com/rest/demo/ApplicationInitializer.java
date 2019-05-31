package com.rest.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * After implementing our resource and defining the requests and responses of
 * our API, now we need to configure the context url of our API and instruct our
 * servlet container to load the resource on startup. Without this configuration
 * section, your resources wouldn't be exposed to clients.
 * 
 * Spring 4.3.0 supports several configuration annotations, there is no more
 * need to define configurations in web.xml.
 * 
 * this is an initializer class which is loaded at the startup of the
 * application, it defines the configuration class of the application along with
 * the context url.
 * 
 * @author Dushyant_Sahu
 *
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/rest/*" };
	}
}
