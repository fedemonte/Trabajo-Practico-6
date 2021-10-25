package entities;

import java.util.ArrayList;

public class CarritoCompras {
    private final ArrayList<Producto> productos = new ArrayList();

    public CarritoCompras() {
    }

    public void agregarProducto(Producto p) {
        productos.add(p);

    }
    public void verificarStockProducto(Producto p){
        if( p.getstockDisponible()>0){
            p.setstockDisponible(p.getstockDisponible()-1);

        }else {
            System.out.println("No hay stock disponible");
        }
    }
    public void verificarDisponiblidadProducto (Producto p){
        if (p.getDisponible() == true) {
            System.out.println("producto Disponible");
        } else {
            System.out.println("produdto NO Disponible");
        }
    }

    public String obtenerDescripcionProductos(Producto p) {
        return p.getDetalle();
    }

    public Integer verCantidadDeProductos() {
        return productos.size();
    }
    
    public Integer buscarProductoEnLaListaDelCarrito(Producto p) {
    	int busqueda = 0;
    	for (int i = 0; i < productos.size(); ++i) {
    		if (p.getId() == productos.get(i).getId()) {
    			busqueda = 1;
    			break;
    		}
    	}
    return busqueda;	
    }
    
    public boolean eliminarProductoDelCarrito(Producto p) {
    	boolean eliminado = false;
    	for (int i = 0; i < productos.size(); ++i) {
    		if (p.getId() == productos.get(i).getId()) {
    			productos.remove(i);
    			eliminado = true;
    			break;
    		}
    	}
    return eliminado;	
    }
     public boolean nombre_y_descripcion(Producto p ){
        if (p.getNombre() != null && p.getDescripcion() != null ){
            return true;
        }
        return false;

     }
    
}
