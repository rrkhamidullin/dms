package com.rrkh.dms.data.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.rrkh.dms.data.repository")
@EntityScan(basePackages = "com.rrkh.dms.data.model")
public class JpaConfiguration {
}
