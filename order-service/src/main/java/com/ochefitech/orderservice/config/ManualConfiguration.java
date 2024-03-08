package com.ochefitech.orderservice.config;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * In this class we'll add all the manual configuration required for Observability to
 * work.
 */
@Configuration(proxyBeanMethods = false)
@RequiredArgsConstructor
public class ManualConfiguration {

    private final KafkaTemplate kafkaTemplate;

    @PostConstruct
    void setup() {
        this.kafkaTemplate.setObservationEnabled(true);
    }

    @Bean
    public ObservationRegistry observationRegistry() {
        return new ObservationRegistry() {
            @Override
            public Observation getCurrentObservation() {
                return null;
            }

            @Override
            public Observation.Scope getCurrentObservationScope() {
                return null;
            }

            @Override
            public void setCurrentObservationScope(Observation.Scope scope) {

            }

            @Override
            public ObservationConfig observationConfig() {
                return null;
            }
        }; // Customize this based on your requirements.
    }


}