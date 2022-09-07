package com.example.almspringvg.controller;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AppIT {


    @Test
    public void testHelloWorld(){
        RestAssured.registerParser("text/plain", Parser.HTML);
        when().get().then()
                .statusCode(200)
                .body("html.body", equalTo("Welcome to our page!"));
    }
}