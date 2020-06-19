/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.modelo;

import java.util.Calendar;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class PacienteTest {

    Date fecha;
    Paciente instance;

    public PacienteTest() {
    }

    @Before
    public void setUp() {
        fecha = Calendar.getInstance().getTime();
        instance = new Paciente(0, "", "", "", '-', fecha, "", "", "", "");
    }

    /**
     * Test of getSexo method, of class Paciente.
     */
    @Test
    public void testGetSexo() {
        char expResult = '-';
        char result = instance.getSexo();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFechaNacimiento method, of class Paciente.
     */
    @Test
    public void testGetFechaNacimiento() {
        Date expResult = fecha;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoSangre method, of class Paciente.
     */
    @Test
    public void testGetTipoSangre() {
        String expResult = "";
        String result = instance.getTipoSangre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProcedencia method, of class Paciente.
     */
    @Test
    public void testGetProcedencia() {
        String expResult = "";
        String result = instance.getProcedencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEtnia method, of class Paciente.
     */
    @Test
    public void testGetEtnia() {
        String expResult = "";
        String result = instance.getEtnia();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInstruccion method, of class Paciente.
     */
    @Test
    public void testGetInstruccion() {
        String expResult = "";
        String result = instance.getInstruccion();
        assertEquals(expResult, result);
    }
}
