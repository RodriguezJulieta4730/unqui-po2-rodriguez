package tpSTATE.mp3;

public class Mp3 {
    private final ContextMp3 contexto = new ContextMp3();

    public ModoMp3 getModo() {
        return contexto.getModo();
    }

    public void play() {
        contexto.play();
    }

    public void pause() {
        contexto.pause();
    }

    public void stop() {
        contexto.stop();
    }
}
