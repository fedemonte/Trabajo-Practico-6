package test;

import entities.CarritoCompras;
import entities.Producto;

import static org.junit.jupiter.api.Assertions.*;

class CarritoComprasTest {
	
    CarritoCompras carrito = new CarritoCompras();
    Producto p1 = new Producto(1,"IPhone","IPhone 12 Pro",true,1469.00,45,"descripcion iphone");
    Producto p3 = new Producto(2,"Xiaomi","Redmi Note 8",false,629.00,54, "descripcion xiaomi");
    Producto p2 = new Producto(3,"IPhone", "IPhone SE",true, 589.00,65, "descripcion Iphone");
    Producto p4 = new Producto(4,"Samsung","Samsung Galaxy M12s",true, 679.00,32, "descripcion Samsung");
    Producto p5 = new Producto(5,"Samsung","Samsung Galaxy S20",true, 754.00,76,"descripcion Samsung");

    
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
    public void comprobar_existencia_del_producto() {
        carrito.verificarStockProducto(p5);
    	assertEquals(75,p5.getstockDisponible());
    }
    @org.junit.jupiter.api.Test
    public void comprobar_Disponiblidad_Producto(){
        carrito.verificarDisponiblidadProducto(p5);
        assertEquals(true,p5.getDisponible());
    }

    @org.junit.jupiter.api.Test
    public void test_producto_debe_tener_Nombre_y_Descripcion() {
        boolean resultado = carrito.nombre_y_descripcion(p2);
        boolean esperado = true;
        assertEquals(esperado, resultado);
    }



}