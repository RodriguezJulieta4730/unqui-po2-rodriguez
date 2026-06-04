package tpSTATE.videoJuego;

import lombok.Getter;

@Getter
public class ContextMaquina {
    private EstadoMaquina estado;

    public ContextMaquina(){
        this.estado = new EstadoApagado(this);
    }

    public void cambiarEstado(EstadoMaquina nuevoEstado) {
        this.estado=nuevoEstado;
    }

    public void encender() {
        estado.encender();
    }

    public void ingresarFicha() {
        estado.ingresarFicha();
    }

    public void jugar() {
        estado.jugar();
    }

    public void terminarJuego() {
        estado.terminarJuego();
    }

    public void apagar() {
        estado.apagar();
    }
}
