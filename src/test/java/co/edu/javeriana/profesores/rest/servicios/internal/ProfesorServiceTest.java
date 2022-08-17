package co.edu.javeriana.profesores.rest.servicios.internal;

import co.edu.javeriana.profesores.rest.repositorios.ProfesorRepository;
import co.edu.javeriana.profesores.entidades.Profesor;
import org.assertj.core.api.Assertions;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class ProfesorServiceTest {

    @Mock
    private ProfesorRepository profesorRepository;

    @InjectMocks
    private ProfesorService profesorService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddProfesor(){

        Profesor profesor = Profesor.builder().id(1).nombre("Test").build();
        Mockito.when(profesorRepository.addProfesor(profesor)).thenReturn(profesor);
        Profesor result = profesorService.agregarProfesor(profesor);


        Mockito.verify(profesorRepository, Mockito.times(2)).addProfesor(profesor);
        assertThat(result, IsEqual.equalTo(profesor));
    }
}
