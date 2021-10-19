package entities;

import java.util.ArrayList;

public class CarritoCompras {
    private final ArrayList<Producto> productos = new ArrayList();

    public CarritoCompras() {

        
    }

    public void agregarProducto(Producto p) {
        productos.add(p);

    }

    public String obtenerDescripcionProductos(Producto p) {
        return p.getDetalle();
    }

    public Integer verCantidadDeProductos() {
        return productos.size();
    }
}
