package tpComposite.SistemaDeArchivos;



import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Directorio implements FyleSystem {
    private List<FyleSystem> fileSystems;
    private String nombre;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

    public Directorio(String nombre, FyleSystem... fileSystems) {
        this.nombre = nombre;
        this.fileSystems= List.of(fileSystems);
        this.fechaCreacion = LocalDateTime.now();
        this.fechaModificacion = LocalDateTime.now();
    }

    @Override
    public int totalSize() {
        int pesoTotal = 0;
        for (FyleSystem f: fileSystems){
            pesoTotal += f.totalSize();
        }
        return pesoTotal;
    }

    @Override
    public String printStructure() {
        StringBuilder estructuraHijos = new StringBuilder();
        for (FyleSystem f: fileSystems){
            estructuraHijos.append("\n").append(f.printStructure().indent(2).stripTrailing());
        }
        return nombre + estructuraHijos;
    }

    @Override
    public FyleSystem lastModified() {
        if (fileSystems.isEmpty()) {
            return this;
        }

        FyleSystem masNuevo = fileSystems.getFirst().lastModified();

        for (FyleSystem f : fileSystems) {
            FyleSystem hijo = f.lastModified();
            if (hijo != null && hijo.getFechaModificacion().isAfter(masNuevo.getFechaModificacion())) { //Comparo las fechas de modificacion de los hijos
                masNuevo = hijo;
            }
        }

        // Se compara la fecha de modificacion del directorio con la del mas nuevo
        if (this.fechaModificacion != null && this.fechaModificacion.isAfter(masNuevo.getFechaModificacion())) {
            return this;
        }

        return masNuevo;
    }

    @Override
    public FyleSystem eldestModified() {
        if (fileSystems.isEmpty()) {
            return this;
        }

        // Buscamos el más antiguo entre sus contenidos
        FyleSystem masAntiguo = fileSystems.getFirst().eldestModified();

        for (FyleSystem f : fileSystems) {
            FyleSystem candidato = f.eldestModified();
            if (candidato != null && candidato.getFechaModificacion().isBefore(masAntiguo.getFechaModificacion())) {
                masAntiguo = candidato;
            }
        }

        // Lo mismo para el más antiguo
        if (this.fechaModificacion != null && this.fechaModificacion.isBefore(masAntiguo.getFechaModificacion())) {
            return this;
        }

        return masAntiguo;
    }

    @Override
    public void cambiarNombre(String unNombre) {
        this.nombre=unNombre;
        this.fechaModificacion = LocalDateTime.now();
    }

}
