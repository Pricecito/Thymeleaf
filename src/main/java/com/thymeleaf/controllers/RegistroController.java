package com.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.domain.Persona;
import com.thymeleaf.service.PersonaService;

@Controller
@RequestMapping("registro")
public class RegistroController {

    @Autowired
    @Qualifier("servicePersona")
    @Lazy
    private PersonaService personaService;

    @GetMapping
    public String index(Model model) {

        model.addAttribute("personas", personaService.getPersonas());
        model.addAttribute("persona", new Persona());
        model.addAttribute("title", "REGISTRO DE PERSONA");

        return "registro/index";
    }

    @PostMapping
    public String save(ersona persona) {
        System.out.println("EJECUTANDO METODO");
        personaService.savePersona(persona);
        return "redirect:/registro";
    }

}
