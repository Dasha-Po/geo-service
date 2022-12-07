package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {
    LocalizationServiceImpl localizationService;

    @BeforeEach
    void init() {
        localizationService = new LocalizationServiceImpl();
    }

    @Test
    void testLocaleRussia() {
        String result = localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals("Добро пожаловать", result);
    }

    @Test
    void testLocaleUSA() {
        String result = localizationService.locale(Country.USA);
        Assertions.assertEquals("Welcome", result);
    }

    @Test
    void testLocaleGermany() {
        String result = localizationService.locale(Country.GERMANY);
        Assertions.assertEquals("Welcome", result);
    }

    @Test
    void testLocaleBrazil() {
        String result = localizationService.locale(Country.BRAZIL);
        Assertions.assertEquals("Welcome", result);
    }
}