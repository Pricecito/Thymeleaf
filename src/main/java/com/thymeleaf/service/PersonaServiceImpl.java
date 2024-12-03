package com.thymeleaf.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.PagedResultsResponseControl;

import org.springframework.boot.logging.LoggingSystem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thymeleaf.domain.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

    public PersonaServiceImpl() {
        System.out.println("INYECTANDO SERVICE");
    }

    private List<Persona> personas;

    @Override
    public ResponseEntity<?> getPersonas() {
        return ResponseEntity.ok(personas);
    }

    public ResponseEntity<?> getPersona(int id) {
        for (var p : this.personas) {
            if (p.getId() == id) {
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<?> savePersona(Persona persona) {
        this.personas.add(persona);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}")
                .buildAndExpand(persona.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @Override
    public void generateList() {
        personas = new ArrayList<Persona>();

    }

    @Override
    public void deletePersona(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePersona'");
    }

    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletePersona'");
}
