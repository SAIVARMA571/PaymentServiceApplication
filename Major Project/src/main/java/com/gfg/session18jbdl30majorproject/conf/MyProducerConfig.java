package com.gfg.session18jbdl30majorproject.conf;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyProducerConfig {

    @Bean
    Map<Object,Object> producerConfig(){
        Map<Object,Object> properties = new HashMap<>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return properties;

    }

    @Bean
    ProducerFactory<String,String> producerFactory(){
        return new DefaultKafkaProducerFactory(producerConfig());
    }

    @Bean
    KafkaTemplate<String,String> kafkaTemplate(){
        KafkaTemplate<String,String> kafkaTemplate =  new KafkaTemplate(producerFactory());
        return kafkaTemplate;

    }
}
