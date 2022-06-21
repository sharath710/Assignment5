package com.sharath.students.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("{!prod}")	//this disables the swagger in prod profile
@Configuration
@EnableSwagger2

public class SwaggerConfig {
}
