package io.fourfinanceit.homework.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"io.fourfinanceit.homework.domain"})
@EnableJpaRepositories(basePackages = {"io.fourfinanceit.homework.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
