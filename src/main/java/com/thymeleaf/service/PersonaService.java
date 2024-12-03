package com.thymeleaf.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.thymeleaf.domain.Persona;

public interface PersonaService {

    void generateList();

    ResponseEntity<?> getPersonas();

    ResponseEntity<?> getPersona();

    ResponseEntity<?> savePersona(Persona persona);

    ResponseEntity<?> deletePersona(Persona persona);

}
