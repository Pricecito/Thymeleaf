package com.thymeleaf.service;

import java.util.List;

import com.thymeleaf.domain.Persona;

public interface PersonaService {

    List<Persona> generateList();

    List<Persona> getPersonas();

    Persona getPersona();

    void savePersona(Persona persona);

    void deletePersona(Persona persona);

}
