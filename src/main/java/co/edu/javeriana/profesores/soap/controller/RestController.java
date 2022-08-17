package co.edu.javeriana.profesores.soap.controller;

import co.edu.javeriana.profesores.soap.model.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private PersonaRepository personaRepository;

    @RequestMapping("/hola")
    public String helloworld(){
        return "Hola Mundo";
    }

}
