package tpSTATE.videoJuego;

public class Maquina {
    private final ContextMaquina contextMaquina = new ContextMaquina();

    public EstadoMaquina getEstado() {
        return contextMaquina.getEstado();
    }

    public void encender() {
        contextMaquina.encender();
    }

    public void ingresarFicha() {
        contextMaquina.ingresarFicha();
    }

    public void jugar() {
        contextMaquina.jugar();
    }

    public void terminarJuego() {
        contextMaquina.terminarJuego();
    }

    public void apagar() {
        contextMaquina.apagar();
    }
}
