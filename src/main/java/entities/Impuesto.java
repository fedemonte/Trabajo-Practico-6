package entities;

public class Impuesto {
    private int idImpuesto;
    private String nombre;
    private double porcentaje;
    private String descripcion;


    public Impuesto() {
    }

    public Impuesto(int idImpuesto, String nombre, double porcentaje, String descripcion) {
        this.idImpuesto = idImpuesto;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }

    public int getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(int idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
