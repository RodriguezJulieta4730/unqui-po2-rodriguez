package tpComposite.SistemaDeArchivos;

import java.time.Instant;
import java.time.LocalDateTime;

public interface FyleSystem {
    int totalSize();
    String printStructure();
    FyleSystem lastModified();
    FyleSystem eldestModified();
    void cambiarNombre(String unNombre);
    LocalDateTime getFechaModificacion();
}
