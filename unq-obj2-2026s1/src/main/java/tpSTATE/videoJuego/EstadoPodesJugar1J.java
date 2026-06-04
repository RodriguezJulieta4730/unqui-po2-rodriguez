package tpSTATE.videoJuego;

public class EstadoPodesJugar1J implements EstadoMaquina {
    ContextMaquina context;
    public EstadoPodesJugar1J(ContextMaquina context) {
        this.context=context;
    }

    @Override
    public void encender() {
        throw new IllegalStateException("La máquina ya está encendida y se puede jugar.");
    }

    @Override
    public void apagar() {
        context.cambiarEstado(new EstadoApagado(context));
    }

    @Override
    public void ingresarFicha() {
        context.cambiarEstado(new EstadoPodesJugar2J(context));

    }

    @Override
    public void jugar() {
        context.cambiarEstado(new EstadoJugando1j(context));
    }

    @Override
    public void terminarJuego() {
        throw new IllegalStateException("Todavia no estamos jugando, no se puede terminar juego");
    }
}
