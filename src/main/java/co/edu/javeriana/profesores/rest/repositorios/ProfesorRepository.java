package co.edu.javeriana.profesores.rest.repositorios;

import co.edu.javeriana.profesores.entidades.Profesor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class ProfesorRepository {

    private List<Profesor> repositorio;


    public Profesor addProfesor(Profesor p){
        repositorio.add(p);
        return p;
    }

}
