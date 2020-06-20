/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorTest;

import Controlador.ConexionDB;
import Modelo.Usuario;
import java.sql.ResultSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Atancuri
 */
public class ConexionDBTest {
    
    public ConexionDBTest() {
    }
   
    @Before
    public void setUp() {
         ConexionDB.setUsuarioSesion(null);
    }

    /**
     * Test of ejecutarSentencia method, of class ConexionDB.
     */
    @Test
    public void testEjecutarSentencia() throws ClassNotFoundException {
        boolean expResult = true;
        boolean result = ConexionDB.ejecutarSentencia("");
        assertEquals(expResult, result);
    }

    /**
     * Test of ejecutarConsulta method, of class ConexionDB.
     */
    @Test
    public void testEjecutarConsulta() throws ClassNotFoundException {
        ResultSet expResult = null;
        ResultSet result = ConexionDB.ejecutarConsulta("");
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuarioSesion method, of class ConexionDB.
     */
    @Test
    public void testGetUsuarioSesion() {
        Usuario expResult = null;
        Usuario result = ConexionDB.getUsuarioSesion();
        assertEquals(expResult, result);
    }
}