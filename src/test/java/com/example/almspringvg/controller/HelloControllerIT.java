package com.example.almspringvg.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIT {

    @Autowired
    private MockMvc mvc;

    @Test
    void hello() throws Exception {
        RequestBuilder request =  MockMvcRequestBuilders.get("/hello");
        MvcResult result =  mvc.perform(request).andReturn();
        assertEquals("Hello, World", result.getResponse().getContentAsString());
    }
}