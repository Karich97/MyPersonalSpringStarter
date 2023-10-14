package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "karich-starter")
public class KarichStarterProperties {
    private String author;

    public String getAuthor() {
        return author;
    }
}
