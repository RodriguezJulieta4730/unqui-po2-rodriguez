package tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {
    private ArrayList<Producto> catalogo = new ArrayList<>();

    public Supermercado() {
    }

    public void agregarProducto(Producto producto) {
        catalogo.add(producto);
    }

    public int getCantidadDeProductos() {
        return catalogo.size();
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Producto p: catalogo){
            total+= p.precio;
        }
        return total;
    }
}
