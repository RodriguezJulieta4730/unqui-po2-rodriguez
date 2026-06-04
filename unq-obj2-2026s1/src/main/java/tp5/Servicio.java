package tp5;

public class Servicio implements Factura {
    private double costoPorUnidad;
    private int cantUnidades;

    public Servicio(double costoPorUnidad, int cantUnidades) {
        this.costoPorUnidad=costoPorUnidad;
        this.cantUnidades=cantUnidades;
    }

    @Override
    public double getMontoAPagar() {
        return costoPorUnidad * cantUnidades;
    }
}
