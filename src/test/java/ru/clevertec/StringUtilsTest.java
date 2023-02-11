package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("32"));
    }
    @Test
    void isNegativeNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("-54"));
    }

    @Test
    void isStringNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("fifteen"));
    }
}