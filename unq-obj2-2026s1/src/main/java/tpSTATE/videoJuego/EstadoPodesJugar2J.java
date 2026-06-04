package tpSTATE.videoJuego;

public class EstadoPodesJugar2J implements EstadoMaquina {
    ContextMaquina context;
    public EstadoPodesJugar2J(ContextMaquina context) {
        this.context=context;
    }

    @Override
    public void encender() {
        throw new IllegalStateException("La maquina ya esta encendida y podes jugar.");
    }

    @Override
    public void apagar() {
        context.cambiarEstado(new EstadoApagado(context));
    }

    @Override
    public void ingresarFicha() {
        throw new IllegalStateException("No se puede ingresar mas fichas, su maximo es de dos jugadores .");
    }

    @Override
    public void jugar() {
        context.cambiarEstado(new EstadoJugando2J(context));
    }

    @Override
    public void terminarJuego() {
        throw new IllegalStateException("No se puede terminar, porque no estan jugando");
    }
}
