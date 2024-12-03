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
    public ResponseEntity<?> deletePersona(int id) {
        for (var p : this.personas) {
            if (p.getId() == id) {
                personas.remove(p);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();

    }

    public ResponseEntity<?> getPersonas() {
        return ResponseEntity.ok(personas);
    }

}
