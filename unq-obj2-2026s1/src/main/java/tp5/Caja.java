package tp5;

import lombok.Getter;

import java.util.*;
@Getter
public class Caja implements Agencia{
    private Queue<Cliente> clientesEsperando= new LinkedList<>();
    private Map<Producto,Integer> stock = new HashMap<>();
    private double caja = 0;

    public void llegaUnCliente(Cliente unCliente) {
        clientesEsperando.add(unCliente);
    }

    public void agregarStock(Producto unProducto, int unStock) {
        stock.put(unProducto,unStock);
    }

    public void atenderCliente() {
        if (clientesEsperando.isEmpty()){
            throw new NoHayClientesException("No hay clientes");
        }
        Cliente primerCliente = clientesEsperando.poll();
        for (Producto p : primerCliente.getProductos()){
            caja += p.precio;
            stock.put(p, stock.get(p)-1); //le saca uno al stock
        }

    }

    public int stockDe(Producto unProducto) {
        return stock.get(unProducto);
    }

    public void cobrarFacturas(Cliente unCliente) {
        for ( Factura f : unCliente.getFacturas()){
            caja+= f.getMontoAPagar();
            registrarPago(f);
        }
    }

    @Override
    public void registrarPago(Factura factura) {
        System.out.println("Se registro el pago");
    }
}
