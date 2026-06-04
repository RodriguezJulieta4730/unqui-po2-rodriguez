package tp5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonaTest {

    @Test
    void test001_CompararEdadesDePersonas(){
        Persona persona1 = new Persona("Julieta", LocalDate.of(2006,3,28) , 20);
        Persona persona2 = new Persona("Agustin", LocalDate.of(1994,3,7), 32 );

        Assertions.assertTrue(persona2.esMayorQue(persona1) );

    }
}
