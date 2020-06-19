/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.modelo;

import java.util.Date;
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
public class CitaTest {

    Cita instance;
    Medico medico;
    Paciente paciente;

    public CitaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Cita(0, new Date(), "", "", null, null, "");
        medico = new Medico(1, "", "", "", "", "", "", null);
        paciente = new Paciente(2, "", "", "", '-', new Date(), "", "", "", "");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFecha method, of class Cita.
     */
    @Test
    public void testGetFecha() {
        Date expResult = new Date();
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getHora method, of class Cita.
     */
    @Test
    public void testGetHora() {

        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMotivo method, of class Cita.
     */
    @Test
    public void testGetMotivo() {
        System.out.println("getMotivo");

        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getEstado method, of class Cita.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");

        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
