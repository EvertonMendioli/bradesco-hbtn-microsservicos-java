package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.time.LocalDate;


@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {      
       RequestBuilder request = get("/calculator/welcome");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
       RequestBuilder request = get("/calculator/addNumbers?number1=2&number2=2");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("4.0", result.getResponse().getContentAsString());
    
    }

    @Test
    void subNumbers() throws Exception {
       RequestBuilder request = get("/calculator/subNumbers?number1=4&number2=2");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("2.0", result.getResponse().getContentAsString());
    
    }

    @Test
    void divideNumbers() throws Exception {
       RequestBuilder request = get("/calculator/divideNumbers?number1=4&number2=2");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("2.0", result.getResponse().getContentAsString());
    
    }

    @Test
    void factorial() throws Exception {
       RequestBuilder request = get("/calculator/factorial?factorial=3");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("6", result.getResponse().getContentAsString());
    
    }

    @Test
    void calculeDayBetweenDate() throws Exception {
       RequestBuilder request = get("/calculator/calculeDayBetweenDate?localDate1=" 
       + LocalDate.of(2020, 3, 15) 
       + "&localDate2=" + LocalDate.of(2020, 3, 29));
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("14", result.getResponse().getContentAsString());
    
    }

    @Test
    void integerToBinary() throws Exception {
       RequestBuilder request = get("/calculator/integerToBinary?number1=5");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("101", result.getResponse().getContentAsString());
    
    }

    @Test
    void integerToHexadecimal() throws Exception {
       RequestBuilder request = get("/calculator/integerToHexadecimal?number1=170");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("aa", result.getResponse().getContentAsString());
    
    }
    // TODO - Implementar os demais métodos: subNumbers, divideNumbers, factorial, 
    //        calculeDayBetweenDate, integerToBinary e integerToHexadecimal
}
