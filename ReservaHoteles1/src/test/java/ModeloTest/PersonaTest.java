/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class PersonaTest {

    Persona instance;

    public PersonaTest() {
    }

    @Before
    public void setUp() {
        instance = new Medico(0, "", "", "", "", "", "", null);
    }

    /**
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCedula method, of class Persona.
     */
    @Test
    public void testGetCedula() {
        String expResult = "";
        String result = instance.getCedula();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellido method, of class Persona.
     */
    @Test
    public void testGetApellido() {
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

}
