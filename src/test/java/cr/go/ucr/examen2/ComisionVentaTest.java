/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cr.go.ucr.examen2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author YeicolR
 */
public class ComisionVentaTest {
    
     @Test
    public void testComisionPrimerRango() {
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        
        
        double montoVenta = 1000.00;
        
        
        double comision = instancia.calcular(montoVenta);
        
        
        assertEquals(30.00, comision, 0.01);
    }

   
    @Test
    public void testMontoFueraDeRango() {
        
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        
       
        double montoVenta = 120000.00;
        
        
        double comision = instancia.calcular(montoVenta);
        
       
        assertEquals(-1.0, comision, 0.01);
    }

  
    @Test
    public void testComisionSegundoRango() {
       
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        
        
        double montoVenta = 3000.00;
        
        
        double comision = instancia.calcular(montoVenta);
        
        
        assertEquals(210.00, comision, 0.01);
    }

  
    @Test
    public void testMontoInvalido() {
       
        ComisionVenta instancia =ComisionVenta.getCurrentInstance();
        
        
        double montoVenta = -0.01;
        
        
        double comision = instancia.calcular(montoVenta);
        
        
        assertEquals(-1.0, comision, 0.01);
    }
    
     @Test
    public void testLimiteInferiorRango1() {
        // Límite inferior del rango 1
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 0.00;
        double comision = instancia.calcular(montoVenta);
        assertEquals(0.00, comision, 0.01);
    }

    @Test
    public void testLimiteSuperiorRango1() {
        // Límite superior del rango 1
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 1500.00;
        double comision = instancia.calcular(montoVenta);
        assertEquals(45.00, comision, 0.01);
    }

    @Test
    public void testLimiteInferiorRango2() {
        // Límite inferior del rango 2
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 1500.01;
        double comision = instancia.calcular(montoVenta);
        assertEquals(105.00, comision, 0.01);
    }

    @Test
    public void testLimiteSuperiorRango2() {
        // Límite superior del rango 2
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 5000.00;
        double comision = instancia.calcular(montoVenta);
        assertEquals(350.00, comision, 0.01);
    }

    @Test
    public void testLimiteInferiorRango3() {
        // Límite inferior del rango 3
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 5000.01;
        double comision = instancia.calcular(montoVenta);
        assertEquals(600.00, comision, 0.01);
    }

    @Test
    public void testLimiteSuperiorRango3() {
        // Límite superior del rango 3
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 15000.00;
        double comision = instancia.calcular(montoVenta);
        assertEquals(1800.00, comision, 0.01);
    }

    @Test
    public void testLimiteInferiorRango4() {
        // Límite inferior del rango 4
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 15000.01;
        double comision = instancia.calcular(montoVenta);
        assertEquals(2250.00, comision, 0.01);
    }

    @Test
    public void testLimiteSuperiorRango4() {
        // Límite superior del rango 4
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 100000.00;
        double comision = instancia.calcular(montoVenta);
        assertEquals(15000.00, comision, 0.01);
    }

    @Test
    public void testMontoInvalidoNegativo() {
        // Caso inválido: monto negativo
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = -0.01;
        double comision = instancia.calcular(montoVenta);
        assertEquals(-1.0, comision, 0.01);
    }

    @Test
    public void testMontoInvalidoExcedido() {
        // Caso inválido: monto excede el máximo permitido
        ComisionVenta instancia = ComisionVenta.getCurrentInstance();
        double montoVenta = 100000.01;
        double comision = instancia.calcular(montoVenta);
        assertEquals(-1.0, comision, 0.01);
    }
}