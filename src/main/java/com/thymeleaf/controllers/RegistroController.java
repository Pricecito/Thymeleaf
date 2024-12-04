package com.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
        model.addAttribute("title_form", "REGISTRO DE PERSONA");
        model.addAttribute("action", "/registro");

        return "registro/index";
    }

    @PostMapping
    public String save(Persona persona) {
        System.out.println("EJECUTANDO METODO");
        personaService.savePersona(persona);
        return "redirect:/registro";
    }

    @GetMapping("/{id}")
    public String getMethodName(@PathVariable int id, Model modelo) {
        Persona p = personaService.getPersona(id);
        modelo.addAttribute("personas", personaService.getPersonas());
        modelo.addAttribute("persona", p);
        modelo.addAttribute("title_form", "EDITAR PERSONA");
        modelo.addAttribute("action", "/registro/update");
        return "registro/index";
    }

    @PostMapping("/update")
    public String update(Persona persona) {
        personaService.updatePersona(persona);
        return "redirect:/registro";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        personaService.deletePersona(id);
        return "redirect:/registro";
    }

}
