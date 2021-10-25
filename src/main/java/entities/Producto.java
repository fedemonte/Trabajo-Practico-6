package entities;

public class Producto {
	
	private int id;
    private String nombre;
    private String detalle;
    private Double precio;
    private Boolean disponible;
    private	int stockDisponible;
    private String descripcion;

    public Producto() {

    }


    public Producto(int id, String nombre, String detalle, boolean disponible, double precio, int stockDisponible, String descripcion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio = precio;
        this.disponible = disponible;
        this.stockDisponible = stockDisponible;
        this.descripcion = descripcion;
    }



    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Boolean getDisponible() {
        return disponible;
    }


    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    public int getstockDisponible () {
    	return stockDisponible;
    }
    public void setstockDisponible(int stockDisponible) {
    	this.stockDisponible=stockDisponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

