package com.thymeleaf.service;

import java.util.List;

import com.thymeleaf.domain.Persona;

public interface PersonaService {

    List<Persona> getPersonas();

    Persona getPersona(int id);

    void savePersona(Persona persona);

    Persona updatePersona(Persona persona);

    Persona deletePersona(int persona);

}
