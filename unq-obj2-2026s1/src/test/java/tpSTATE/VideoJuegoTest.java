package tpSTATE;

import org.junit.jupiter.api.Test;
import tpSTATE.videoJuego.*;

import static org.junit.jupiter.api.Assertions.*;

public class VideoJuegoTest {
    @Test
    void test01_maquinaApagada(){
        Maquina maquina = new Maquina();

        assertInstanceOf(EstadoApagado.class, maquina.getEstado());
    }

    @Test
    void test02_EncerderMaquina(){
        Maquina maquina = new Maquina();
        maquina.encender();

        assertInstanceOf(EstadoEncendidoEsperandoFicha.class, maquina.getEstado());
    }

    @Test
    void test03_PonerUnaFicha(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();

        assertInstanceOf(EstadoPodesJugar1J.class, maquina.getEstado());
    }

    @Test
    void test04_Jugar1J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.jugar();

        assertInstanceOf(EstadoJugando1j.class, maquina.getEstado());
    }
    @Test
    void test05_PodesJugar2J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.ingresarFicha();

        assertInstanceOf(EstadoPodesJugar2J.class, maquina.getEstado());
    }
    @Test
    void test06_Jugando2J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.ingresarFicha();
        maquina.jugar();
        assertInstanceOf(EstadoJugando2J.class, maquina.getEstado());
    }

    @Test
    void test07_TerminarJuego2J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.ingresarFicha();
        maquina.jugar();
        maquina.terminarJuego();
        assertInstanceOf(EstadoEncendidoEsperandoFicha.class, maquina.getEstado());
    }

    @Test
    void test08_TerminarJuego1J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.jugar();
        maquina.terminarJuego();
        assertInstanceOf(EstadoEncendidoEsperandoFicha.class, maquina.getEstado());
    }

    @Test
    void test09_noSePuedeEncenderSiYaEstaJugando() {
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.jugar();

        // 3. Verificamos que salte la excepción al intentar encender de nuevo
        IllegalStateException exception = assertThrows(IllegalStateException.class, maquina::encender);

        // 4. (Opcional) Validamos que el mensaje de error sea el esperado
        assertEquals("La máquina ya está encendida y jugando.", exception.getMessage());
    }

    @Test
    void test010_ApagarJugandoJuego1J(){
        Maquina maquina = new Maquina();
        maquina.encender();
        maquina.ingresarFicha();
        maquina.jugar();
        maquina.apagar();
        assertInstanceOf(EstadoApagado.class, maquina.getEstado());
    }
}
