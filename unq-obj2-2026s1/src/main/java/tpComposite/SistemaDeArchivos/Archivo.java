package tpComposite.SistemaDeArchivos;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Archivo implements FyleSystem {
    private String nombre;
    private int peso;
    private LocalDateTime fechaModificacion;
    private LocalDateTime fechaCreacion;

    public Archivo(String nombre, int peso) {
        this.nombre=nombre;
        this.peso=peso;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaModificacion = LocalDateTime.now();
    }

    @Override
    public int totalSize() {
        return peso;
    }

    @Override
    public String printStructure() {
        return nombre;
    }

    @Override
    public FyleSystem lastModified() {
        return this;
    }

    @Override
    public FyleSystem eldestModified() {
        return this;
    }

    @Override
    public void cambiarNombre(String unNombre) {
        this.nombre= unNombre;
        this.fechaModificacion = LocalDateTime.now();
    }
}
