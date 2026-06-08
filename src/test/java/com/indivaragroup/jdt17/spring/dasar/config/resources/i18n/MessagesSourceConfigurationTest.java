package com.indivaragroup.jdt17.spring.dasar.config.resources.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessagesSourceConfigurationTest {
    @Autowired
    MessageSource messageSource;

    @Test
    void testHelloEnglish() {
        String message = messageSource.getMessage(
                "error.field.messages.name",
                new Object[]{"buahlil"},
                Locale.ENGLISH
        );

        assertEquals("this name [buahlil] is already exist on database", message );
    }

    @Test
    void testHelloIndonesia() {
        String message = messageSource.getMessage(
                "error.field.messages.name",
                new Object[]{"buahlil"},
                new Locale("id", "ID")
        );

        assertEquals("nama ini [buahlil] sudah terdaftar di database", message );
    }

}
