package com.estsoft.hispring.controller;

import com.estsoft.hispring.domain.Person;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HiController {
    @GetMapping("/hi")  //Get localhost:8080/hi
    public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    // POST localhost:8080/hi
    @PostMapping("/hi")
    public String testPost(@RequestBody String value) {
        ObjectMapper objectMapper = new ObjectMapper();
        //json -> java object

        try {
            Person person = objectMapper.readValue(value, Person.class);
            System.out.println("person = " + person);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("value : " + value);
        return value;
    }
}
