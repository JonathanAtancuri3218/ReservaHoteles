/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import scm.modelo.Medico;
import scm.modelo.Persona;
import scm.modelo.Usuario;

/**
 *
 * @author Jonathan Atancuri
 */
public class ControladorPersonaTest {
    
    Persona persona;
    Usuario usuario;
    
    public ControladorPersonaTest() {
    }
    
    @Before
    public void setUp() {
       usuario =  new Usuario(10000, "", "", "");
       persona = new Medico(10000, "", "", "", "", "", "", usuario);
    }

    /**
     * Test of agregar method, of class ControladorPersona.
     */
    @Test
    public void testAgregar() {
        String tipo = "medico";
        boolean expResult = true;
        boolean result = ControladorPersona.agregar(persona, tipo);
        assertEquals(expResult, result);
    }

    /**
     * Test of modificar method, of class ControladorPersona.
     */
    @Test
    public void testModificar() {
        String tipo = "medico";
        boolean expResult = false;
        boolean result = ControladorPersona.modificar(persona, tipo);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscar method, of class ControladorPersona.
     */
    @Test
    public void testBuscar() {
        String cedula = "";
        String tipo = "medico";
        Persona expResult = null;
        Persona result = ControladorPersona.buscar(cedula, tipo);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class ControladorPersona.
     */
    @Test
    public void testEliminar() {
        String cedula = "";
        String tipo = "medico";
        boolean expResult = true;
        boolean result = ControladorPersona.eliminar(cedula, tipo);
        assertEquals(expResult, result);
    }
}