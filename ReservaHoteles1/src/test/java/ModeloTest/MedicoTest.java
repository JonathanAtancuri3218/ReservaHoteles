/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class MedicoTest {

    Medico instance;

    public MedicoTest() {
    }

    @Before
    public void setUp() {
        instance = new Medico(0, "", "", "", "", "", "", null);
    }

    /**
     * Test of getDireccion method, of class Medico.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Medico.
     */
    @Test
    public void testGetEmail() {
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEspecialidad method, of class Medico.
     */
    @Test
    public void testGetEspecialidad() {
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
    }
}
