package tp5;

public class ProductoCooperativa extends Producto {
    public ProductoCooperativa(double precio) {
        this.precio=precio;
    }

    @Override
    public double getPrecio(){
        return precio - precio*0.1;
    }

}
