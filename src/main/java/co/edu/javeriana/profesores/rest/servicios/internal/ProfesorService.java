package co.edu.javeriana.profesores.rest.servicios.internal;

import co.edu.javeriana.profesores.rest.repositorios.ProfesorRepository;
import co.edu.javeriana.profesores.entidades.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor agregarProfesor(Profesor profesor){
        if (Objects.isNull(profesor.getId()) || Objects.isNull(profesor.getNombre())){
            throw new RuntimeException("Datos incompletos");
        }

        return profesorRepository.addProfesor(profesor);

    }

}
