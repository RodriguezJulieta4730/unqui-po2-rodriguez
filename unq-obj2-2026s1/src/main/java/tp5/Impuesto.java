package tp5;

public class Impuesto implements Factura {
    private double tasaDeServicio;

    public Impuesto(double tasaDeServicio){
        this.tasaDeServicio=tasaDeServicio;
    }

    @Override
    public double getMontoAPagar() {
        return tasaDeServicio;
    }
}
