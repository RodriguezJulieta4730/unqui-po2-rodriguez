package tp4.supermercado;


import lombok.Getter;

@Getter
public class Producto {
    protected String nombre;
    protected double precio;
    protected boolean precioCuidado = false;
    protected double descuento = 0;


    public Producto(String nombre, double precio, boolean precioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = precioCuidado;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aumentarPrecio(double aumento) {
        if (aumento<0){
            throw new IllegalArgumentException("El aumento es negativo");
        }
        precio += aumento;
    }
}
