package co.edu.javeriana.profesores.rest.servicios.external;

import co.edu.javeriana.profesores.entidades.Profesor;
import co.edu.javeriana.profesores.rest.servicios.internal.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfesorRestService {

    @Autowired
    private ProfesorService profesorService;

    @RequestMapping( value = "/profesor", method = RequestMethod.POST, consumes = {"application/json", "application/xml"})
    public void agregarProfesor(@RequestBody Profesor profesor){
        this.profesorService.agregarProfesor(profesor);
    }

}
