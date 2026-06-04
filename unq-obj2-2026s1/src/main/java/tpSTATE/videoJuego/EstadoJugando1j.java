package tpSTATE.videoJuego;

public class EstadoJugando1j implements EstadoMaquina {
    ContextMaquina context;
    public EstadoJugando1j(ContextMaquina context) {
        this.context=context;
    }

    @Override
    public void encender() {
        throw new IllegalStateException("La máquina ya está encendida y jugando.");
    }

    @Override
    public void apagar() {
        context.cambiarEstado(new EstadoApagado(context));
    }

    @Override
    public void ingresarFicha() {
        throw new IllegalStateException("No se puede ingresar ficha, el juego ya comenzo.");
    }

    @Override
    public void jugar() {
        throw new IllegalStateException("Ya esta jugando.");
    }

    @Override
    public void terminarJuego() {
        context.cambiarEstado(new EstadoEncendidoEsperandoFicha(context));
    }
}
