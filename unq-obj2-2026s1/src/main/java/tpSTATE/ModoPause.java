package tpSTATE;

import tpSTATE.mp3.ContextMp3;
import tpSTATE.mp3.ModoMp3;
import tpSTATE.mp3.ModoSeleccionDeCancion;

public class ModoPause implements ModoMp3 {
    ContextMp3 contexto;
    public ModoPause(ContextMp3 contexto) {
        this.contexto=contexto;

    }

    @Override
    public void play() {
        throw new IllegalStateException("No esta en modo seleccion de cancion");
    }

    @Override
    public void pause() {
        contexto.cambiarModo(new ModoReproduccion(contexto));

    }

    @Override
    public void stop() {
        contexto.cambiarModo(new ModoSeleccionDeCancion(contexto));

    }
}
