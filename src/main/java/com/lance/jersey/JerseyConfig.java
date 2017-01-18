package com.lance.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.lance.jersey.services.helpPortal.HelpPortalWebService;
import com.lance.jersey.services.product.ProductWebService;

@Configuration
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(ProductWebService.class);
		register(HelpPortalWebService.class);
	}
}
