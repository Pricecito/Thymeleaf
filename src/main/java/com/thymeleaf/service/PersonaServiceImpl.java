package com.thymeleaf.service;

import java.util.List;

import org.springframework.boot.logging.LoggingSystem;
import org.springframework.stereotype.Service;

import com.thymeleaf.domain.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

    public PersonaServiceImpl(){
        System.out.println("INYECTANDO SERVICE")
    }

    @Override
    public List<Persona> getPersonas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonas'");
    }

    @Override
    public Persona getPersona() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersona'");
    }

    @Override
    public void savePersona(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savePersona'");
    }

    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletePersona'");
}

}
