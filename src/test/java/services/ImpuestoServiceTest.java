package services;

import entities.Impuesto;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpuestoServiceTest {
    Impuesto impuesto1 = new Impuesto(1, "iva", 0.21, "Impuesto al valor agregado");
    ImpuestoService impuestoService = new ImpuestoService();

    @org.junit.jupiter.api.Test
    public void cambiarNombreOk() {
        Impuesto impuestoModificado;
        String nombreNuevo = "Ganancias";
        impuestoModificado = impuestoService.modificarNombreImpuesto(impuesto1, nombreNuevo);
        String nombreModificado = impuestoModificado.getNombre();

        assertEquals(nombreNuevo, nombreModificado);
    }

    @org.junit.jupiter.api.Test
    public void cambiarPorcentajeOk() {
        Impuesto impuestoModificado;
        double porcentajeNuevo = 0.65;
        impuestoModificado = impuestoService.modificarPorcentajeImpuesto(impuesto1, porcentajeNuevo);
        double porcentajeModificado = impuestoModificado.getPorcentaje();

        assertEquals(porcentajeNuevo, porcentajeModificado);
    }

}