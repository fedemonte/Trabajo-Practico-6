package test;

import entities.CarritoCompras;
import entities.Producto;

import static org.junit.jupiter.api.Assertions.*;

class CarritoComprasTest {
	
    CarritoCompras carrito = new CarritoCompras();
    Producto p1 = new Producto(1,"IPhone","IPhone 12 Pro",true,1469.00);
    Producto p3 = new Producto(2,"Xiaomi","Redmi Note 8",false,629.00);
    Producto p2 = new Producto(3,"IPhone", "IPhone SE",true, 589.00);
    Producto p4 = new Producto(4,"Samsung","Samsung Galaxy M12s",true, 679.00);
    Producto p5 = new Producto(4,"Samsung","Samsung Galaxy S20",true, 754.00);
    
    @org.junit.jupiter.api.Test
    void  verCantidadDeProductos(){
        carrito.agregarProducto(p1);
        int res_obtenido = carrito.verCantidadDeProductos();
        int res_esperado = 1;
        assertEquals(res_esperado,res_obtenido);

    }

    @org.junit.jupiter.api.Test
    void obtenerDescripcionProductos() {
        String res_obtenido = carrito.obtenerDescripcionProductos(p1);
        String res_esperado = "IPhone 12 Pro";
        assertEquals(res_esperado,res_obtenido);
    }
    
    @org.junit.jupiter.api.Test
    void agregarProdutoYaExistenteAlCarritoDeCompras() {
    	carrito.agregarProducto(p1);
    	carrito.agregarProducto(p2);
    	carrito.agregarProducto(p1);
    	int res_obtenido = carrito.buscarProductoEnLaListaDelCarrito(p1);
    	int res_esperado = 1;
    	assertEquals(res_obtenido, res_esperado);
    }
    
    @org.junit.jupiter.api.Test
    void eliminarProductoDelCarritoDeCompras() {
    	if(carrito.verCantidadDeProductos() != 0) {
    		boolean res_obtenido = carrito.eliminarProductoDelCarrito(p1);
    		boolean res_esperado = true;
    		assertEquals(res_obtenido, res_esperado);
    	}
    }
    
    @org.junit.jupiter.api.Test
    public void agregar_producto__al_carrito_afecta_stock() {
    	carrito.agregarProducto(p5);
    	assertEquals(54,p5.getstockDisponible());
    	
    	
    }
    

}