package org.example.service;

import org.example.config.KarichStarterProperties;

import java.time.LocalDate;

public class KarichService {
    private final KarichStarterProperties properties;

    public KarichService(KarichStarterProperties properties) {
        this.properties = properties;
    }

    public String injectKarichControl(){
        return String.format("This app done %s by %s", LocalDate.now(), properties.getAuthor());
    }
}
