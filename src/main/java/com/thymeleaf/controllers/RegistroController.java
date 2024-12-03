package com.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.service.PersonaService;

@Controller
@RequestMapping("registro")
public class RegistroController {
    @Autowired
    @Qualifier("servicePersona")
    @Lazy
    private PersonaService personaService;

    

}
