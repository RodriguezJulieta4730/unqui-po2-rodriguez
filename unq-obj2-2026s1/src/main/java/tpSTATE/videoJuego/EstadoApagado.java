package tpSTATE.videoJuego;

public class EstadoApagado implements EstadoMaquina {
    private final ContextMaquina context; // final asume que no estas cambiando la variable

    public EstadoApagado(ContextMaquina context) {
        this.context=context;
    }

    @Override
    public void encender() {
        context.cambiarEstado(new EstadoEncendidoEsperandoFicha(context));
    }

    @Override
    public void apagar() {
        throw new IllegalStateException("La máquina ya está apagada");
    }

    @Override
    public void ingresarFicha() {
        throw new IllegalStateException("La máquina esta apagada no se puede ingresar ficha.");
    }

    @Override
    public void jugar() {
        throw new IllegalStateException("La máquina esta apagada no se puede jugar.");
    }

    @Override
    public void terminarJuego() {
        throw new IllegalStateException("La máquina esta apagada el juego ya termino.");
    }
}
