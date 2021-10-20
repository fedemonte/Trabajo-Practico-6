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
    
    public Integer buscarProducto(Producto p) {
    	int busqueda = 0;
    	for (int i = 0; i < productos.size(); ++i) {
    		if (p.getId() == productos.get(i).getId()) {
    			busqueda = 1;
    			break;
    		}
    	}
    return busqueda;	
    }
    
}
