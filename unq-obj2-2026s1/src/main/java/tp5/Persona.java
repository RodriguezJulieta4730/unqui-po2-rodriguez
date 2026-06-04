package tp5;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Persona {
    String nombre;
    LocalDate nacimiento;
    int edad;

    public Persona(String nombre, LocalDate nacimiento, int edad) {
    this.nombre=nombre;
    this.nacimiento=nacimiento;
    this.edad=edad;

    }

    public boolean esMayorQue(Persona otraPersona) {
       return getEdad() > otraPersona.getEdad();
    }
}

