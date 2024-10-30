package com.sisparcas.common.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateConverter {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String asString(LocalDate date) {
        return date != null ? date.format(dateFormatter) : null;
    }

    public LocalDate asDate(String date) {
        try {
            return date != null ? LocalDate.parse(date, dateFormatter) : null;
        } catch (DateTimeParseException e) {
            throw new RuntimeException("Data inválida: " + date, e);
        }
    }
}
