package tpSTATE.mp3;

import lombok.Getter;
import tpSTATE.ModoReproduccion;

@Getter
public class ContextMp3 {
    private ModoMp3 modo;

    public ContextMp3() {
        this.modo = new ModoSeleccionDeCancion(this);
    }

    public void play(){
        modo.play();
    }

    public void cambiarModo(ModoMp3 unModo) {
        this.modo=unModo;
    }

    public void pause(){
        modo.pause();
    }

    public void stop() {
        modo.stop();
    }
}
