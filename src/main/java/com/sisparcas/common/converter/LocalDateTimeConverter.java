package com.sisparcas.common.converter;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Component
public class LocalDateTimeConverter {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public String asString(LocalDateTime date) {
        return date != null ? date.format(dateFormatter) : null;
    }

    public LocalDateTime asDate(String date) {
        try {
            return date != null ? LocalDateTime.parse(date, dateFormatter) : null;
        } catch (DateTimeParseException e) {
            throw new RuntimeException("Data inválida: " + date, e);
        }
    }
}
