package com.example.ifgoiano.api.controllers;

import com.example.ifgoiano.api.entity.Medico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class HelloController {
    @PostMapping
    public void register(@RequestBody Medico medico) {
        System.out.println(medico);
    }

}
