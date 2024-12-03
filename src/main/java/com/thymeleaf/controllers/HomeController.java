package com.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    /*
     * @Value("${indice.hola}")
     * private String hola; CON ESTEA ETIQUETA SE PUEDEN LEER VALOR DE
     * APLICATION.PROPERTIES
     */

    @GetMapping
    public String index(Model model) {
        String hola = "HOLA MUNDO CON THYMELEAF";
        model.addAttribute("model1", hola);
        return "index";
    }

}
