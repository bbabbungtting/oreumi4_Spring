package com.estsoft.hispring.controller;

import com.estsoft.hispring.domain.Person;
import com.estsoft.hispring.service.HiService;
import org.apache.catalina.Service;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HiController {
    HiService service = new HiService();

    @GetMapping("/hi")  //Get localhost:8080/hi
    public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/bye2")  //Get localhost:8080/hi
    public String bye2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Bye %s!", name);
    }

    // POST localhost:8080/hi
    @PostMapping("/hi")
    public String testPost(@RequestBody String value) {
        service.parseProfile(value);
        return value;
    }
}
