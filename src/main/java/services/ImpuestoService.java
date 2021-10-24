package services;

import entities.Impuesto;

import java.util.ArrayList;
import java.util.List;

public class ImpuestoService {
    List <Impuesto>impuestos = new ArrayList();
    Impuesto impuesto = new Impuesto();

    public void agregarImpuesto(Impuesto impuesto){
        if(impuesto != null) {
            impuestos.add(impuesto);
        }else{
            System.out.printf("Error al intentar ingresar el impuesto");
        }
    }

    public Impuesto modificarNombreImpuesto(Impuesto impuesto, String nombreNuevo){
        if(impuesto != null && (!nombreNuevo.isEmpty() && nombreNuevo != null)){
            impuesto.setNombre(nombreNuevo);
        }else{
            System.out.println("Datos erroneos, no se puede modificar el impuesto");
        }
        return impuesto;
    }

    public Impuesto modificarPorcentajeImpuesto(Impuesto impuesto, double procentajeNuevo){
        if(impuesto != null){
            impuesto.setPorcentaje(procentajeNuevo);
        }else{
            System.out.println("Datos erroneos, no se puede modificar el impuesto");
        }
        return impuesto;
    }
}
