package com.example.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Hinweis:
 * - Dieser Test wird voraussichtlich FAILEN, weil isPalindrome '==' nutzt.
 * - In Uebung 2 sollte dieser Bug gefixt werden.
 */
class TextUtilsTest {

    @Test
    void testSafeParseInt() {
        assertEquals(42, TextUtils.safeParseInt("42"));
    }

    @Test
    void testSafeParseInt2() {
        assertEquals(0, TextUtils.safeParseInt("x"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }
}
