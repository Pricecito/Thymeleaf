package com.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.domain.Persona;

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
        Persona modelo = new Persona();
        modelo.setNombre("Persona 1");
        modelo.setApellido("Apellido 1");
        modelo.setDireccion("Direccion 1");
        modelo.setTelefono("Telefono 1");
        modelo.setEdad(15);
        model.addAttribute("modelo", modelo);
        return "index";
    }

}
