package tp5;

public class NoHayClientesException extends RuntimeException {
    public NoHayClientesException(String mensaje) {
        super(mensaje);
    }
}
