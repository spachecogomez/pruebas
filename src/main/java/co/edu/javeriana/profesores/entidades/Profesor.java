package co.edu.javeriana.profesores.entidades;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profesor {

    private int id ;

    private String nombre;

}
