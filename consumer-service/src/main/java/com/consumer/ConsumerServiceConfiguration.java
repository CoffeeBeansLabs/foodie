package com.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories
@EnableAutoConfiguration
@ComponentScan
public class ConsumerServiceConfiguration {
    @Bean
    public ConsumerService consumerService() {
        return new ConsumerService();
    }
}
