package org.example.config;

import org.example.service.KarichService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KarichStarterProperties.class)
public class KarichStarterConfiguration {

    @Bean
    public KarichService getService(KarichStarterProperties properties){
        return new KarichService(properties);
    }
}
