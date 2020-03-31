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
//@Import({SagaParticipantConfiguration.class, TramEventsPublisherConfiguration.class, CommonConfiguration.class})
@ComponentScan
public class ConsumerServiceConfiguration {

//    @Bean
//    public ConsumerServiceCommandHandlers consumerServiceCommandHandlers() {
//        return new ConsumerServiceCommandHandlers();
//    }

    @Bean
    public ConsumerService consumerService() {
        return new ConsumerService();
    }

//    @Bean
//    public CommandDispatcher commandDispatcher(ConsumerServiceCommandHandlers consumerServiceCommandHandlers) {
//        return new SagaCommandDispatcher("consumerServiceDispatcher", consumerServiceCommandHandlers.commandHandlers());
//    }

//    @Bean
//    public ChannelMapping channelMapping() {
//        return new DefaultChannelMapping.DefaultChannelMappingBuilder().build();
//    }

}
