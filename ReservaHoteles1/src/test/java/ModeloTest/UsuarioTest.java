/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTest;

import Modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class UsuarioTest {

    Usuario instance;

    public UsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

       instance = new Usuario(0, "", "");
    }

    @After
    public void tearDown() {
    }
    /**
     * Test of getClave method, of class Usuario.
     */
    @Test
    public void testGetClave() {
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {

        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);

    }

}
