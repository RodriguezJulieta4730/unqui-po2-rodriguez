package tpSTATE.videoJuego;

public class EstadoEncendidoEsperandoFicha implements EstadoMaquina {
    ContextMaquina context;

    public EstadoEncendidoEsperandoFicha(ContextMaquina context) {
        this.context=context;
    }

    @Override
    public void encender() {
        throw new IllegalStateException("La máquina ya está encendida.");
    }

    @Override
    public void apagar() {
        context.cambiarEstado(new EstadoApagado(context));
    }

    @Override
    public void ingresarFicha() {
        context.cambiarEstado(new EstadoPodesJugar1J(context));
    }

    @Override
    public void jugar() {
        throw new IllegalStateException("Necesitas fichas para jugar");
    }

    @Override
    public void terminarJuego() {
        throw new IllegalStateException("El juego no comenzo, no se puede terminar");
    }
}
