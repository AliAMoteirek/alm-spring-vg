package com.example.almspringvg.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void helloTest() {
        // Given
        HelloController helloController = new HelloController();
        // When
        String response = helloController.hello("World");
        // Then
        assertEquals("Hello, World", response);
    }

}