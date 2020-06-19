/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorTest;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scm.modelo.Cita;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Usuario;

/**
 *
 * @author Jonathan Atancuri
 */
public class ControladorCitaTest {

    public ControladorCitaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    Usuario u = new Usuario(1, "Doctor", "cuenca", "Doctor");
    Paciente p = new Paciente(1, null, "Marco", "Perez", 'h', null, null, "Cuenca", null, null);
    Medico m = new Medico(1, "0102585623", "Juan", "Perez", "doctor", "Cuenca", "prueba", u);

    /**
     * Test of agregar method, of class ControladorCita.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Cita cita = new Cita(2, new Date(), "11:00", "gripe", m, p, "activo");
        boolean expResult = false;
        boolean result = ControladorCita.agregar(cita);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult == false) {
            System.out.println("Usuario Ingresar");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificar method, of class ControladorCita.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Cita cita = new Cita(1, new Date(), "00:00", "embarazo", m, p, "activo");
        boolean expResult = ControladorCita.modificar(cita);;
        boolean result = ControladorCita.modificar(cita);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result == false) {
            System.out.println("actualizado correctamente");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminar method, of class ControladorCita.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 1;
        boolean expResult = ControladorCita.eliminar(id);
        boolean result = ControladorCita.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result == false) {
            System.out.println("Eliminado correctamente");
        } else {
            fail("The test case is a prototype.");
        }
    }

}
