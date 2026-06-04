package tpSTATE;

import org.junit.jupiter.api.Test;
import tpSTATE.mp3.ModoSeleccionDeCancion;
import tpSTATE.mp3.Mp3;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class mp3Tests {
    @Test
    void test001_Mp3SeleccionarCancion(){
        Mp3 mp3 = new Mp3();
        assertInstanceOf(ModoSeleccionDeCancion.class, mp3.getModo());
    }

    @Test
    void test002_Mp3SeleccionarCancionPlay(){
        Mp3 mp3 = new Mp3();
        mp3.play();
        assertInstanceOf(ModoReproduccion.class, mp3.getModo());
    }

    @Test
    void test003_Mp3ReproduccionPause(){
        Mp3 mp3 = new Mp3();
        mp3.play();
        mp3.pause();
        assertInstanceOf(ModoPause.class, mp3.getModo());
    }

    @Test
    void test004_Mp3PauseAReproduccion(){
        Mp3 mp3 = new Mp3();
        mp3.play();
        mp3.pause();
        mp3.pause();
        assertInstanceOf(ModoReproduccion.class, mp3.getModo());
    }

    @Test
    void test005_Mp3ReproduccionASeleccionDeCanciones(){
        Mp3 mp3 = new Mp3();
        mp3.play();
        mp3.stop();
        assertInstanceOf(ModoSeleccionDeCancion.class, mp3.getModo());
    }

    @Test
    void test006_Mp3PauseASeleccionDeCanciones(){
        Mp3 mp3 = new Mp3();
        mp3.play();
        mp3.pause();
        mp3.stop();
        assertInstanceOf(ModoSeleccionDeCancion.class, mp3.getModo());
    }
}
