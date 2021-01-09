package com.prugio.query.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
//@EnableJpaRepositories(basePackages = "com.prugio.query.repository", repositoryImplementationPostfix = "Impl")
@EnableJpaRepositories(basePackages = "com.prugio.query.repository")
@EntityScan(basePackages = "com.prugio.query.entity")
public class AppConfig {
}
