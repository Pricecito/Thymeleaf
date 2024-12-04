package com.thymeleaf.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.ldap.PagedResultsResponseControl;

import org.springframework.boot.logging.LoggingSystem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thymeleaf.domain.Persona;

@Service("servicePersona")
public class PersonaServiceImpl implements PersonaService {

    private List<Persona> personas = new ArrayList<Persona>();

    public Persona getPersona(int id) {
        for (var p : this.personas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void savePersona(Persona persona) {
        this.personas.add(persona);
    }

    @Override
    public void deletePersona(int id) {
        for (var p : this.personas) {
            if (p.getId() == id) {
                personas.remove(p);
            }
        }

    }

    public List<Persona> getPersonas() {
        return personas;
    }

}
