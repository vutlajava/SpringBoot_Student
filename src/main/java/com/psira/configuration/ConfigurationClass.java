package com.psira.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public WebClient.Builder getWebClient() {
		return WebClient.builder();
	}

}
