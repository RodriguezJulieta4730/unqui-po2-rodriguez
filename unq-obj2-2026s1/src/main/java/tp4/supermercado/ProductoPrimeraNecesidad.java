package tp4.supermercado;

import lombok.Getter;

@Getter
public class ProductoPrimeraNecesidad extends Producto {

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
        super(nombre, precio, precioCuidado);
        this.descuento = descuento;
        this.precio = precio - (precio * descuento);
    }


}
