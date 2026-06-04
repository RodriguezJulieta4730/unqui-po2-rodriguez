package tpSTATE;

import tpSTATE.mp3.ContextMp3;
import tpSTATE.mp3.ModoMp3;
import tpSTATE.mp3.ModoSeleccionDeCancion;

public class ModoReproduccion implements ModoMp3 {
    ContextMp3 context;
    public ModoReproduccion(ContextMp3 context) {
        this.context=context;
    }

    @Override
    public void play() {
        throw new IllegalStateException("ya esta reproduciendo");
    }

    @Override
    public void pause() {
        context.cambiarModo(new ModoPause(context));

    }

    @Override
    public void stop() {
        context.cambiarModo(new ModoSeleccionDeCancion(context));

    }
}
