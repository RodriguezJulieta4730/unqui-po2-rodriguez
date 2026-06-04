package tpSTATE.mp3;

import tpSTATE.ModoReproduccion;

public class ModoSeleccionDeCancion implements ModoMp3{
    private final ContextMp3 context;
    public ModoSeleccionDeCancion(ContextMp3 context) {
        this.context=context;
    }

    @Override
    public void play() {
        context.cambiarModo(new ModoReproduccion(context));
    }

    @Override
    public void pause() {
        throw new IllegalStateException("No se estan reproduciendo canciones, no se puede pausar");

    }

    @Override
    public void stop() {
        throw new IllegalStateException("No se estan reproduciendo canciones, no se puede parar");
    }
}
