package com.example.prodecer.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaTop")
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }


}
