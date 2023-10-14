package org.example.service;

import org.example.config.KarichStarterProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class KarichService {
    private final KarichStarterProperties properties;
    @Autowired

    public KarichService(KarichStarterProperties properties) {
        this.properties = properties;
    }

    public String injectKarichControl(){
        return String.format("This app done %s by %s", LocalDate.now(), properties.getAuthor());
    }
}
