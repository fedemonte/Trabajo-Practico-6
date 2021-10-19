package entities;

public class Producto {

    private String nombre;
    private String detalle;
    private Double precio;
    private Boolean disponible;


    public Producto() {

    }


    public Producto(String nombre, String detalle, boolean disponible, double precio) {
        super();
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio = precio;
        this.disponible = disponible;
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
}
