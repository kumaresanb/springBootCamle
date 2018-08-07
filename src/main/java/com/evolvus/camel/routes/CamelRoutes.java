package com.evolvus.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/home/kumaresanb/Documents/TAG1/").to("file:/home/kumaresanb/Documents/TAG/");
	}

}
