package com.icon.score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {
    @Test
    void appHasAName() {
        final String name = "Alice";
        HelloWorld classUnderTest = new HelloWorld(name);
        assertEquals(classUnderTest.name(), name);
    }

    @Test
    void appHasAGreeting() {
        HelloWorld classUnderTest = new HelloWorld("Alice");
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}