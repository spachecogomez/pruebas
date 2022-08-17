package co.edu.javeriana.profesores.soap.config;


import co.edu.javeriana.profesores.soap.model.PersonaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonaConfig {

    @Bean
    public PersonaRepository getPersonaRepository(){
        PersonaRepository personaRepository = new PersonaRepository();
        return personaRepository;
    }

}
