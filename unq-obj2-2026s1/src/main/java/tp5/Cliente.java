package tp5;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Cliente {
    private ArrayList <Producto> productos = new ArrayList<>();
    private ArrayList <Factura> facturas = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarFactura(Factura unaFactura) {
        facturas.add(unaFactura);
    }
}
