package scm.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsultaTest {

    Usuario u;
    Medico m;
    Paciente p;
    Cita cita;
    Consulta instance;

    public ConsultaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        // u =new Usuario(1, "", "", "");
        m = new Medico(1, "", "", "", "", "", "", null);
        p = new Paciente(1, "", "", "", '-', new java.sql.Date(1996, 9, 16), "", "", null, "");
        cita = new Cita(1, null, null, null, null, null, null);
        instance = new Consulta(2, null, "", "",
                0, 0, 0, 0, 0, 0, "", "");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetReceta() {
        String expResult = "";
        String result = instance.getReceta();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSintomas() {
        String expResult = "";
        String result = instance.getSintomas();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDiagnostico() {
        String expResult = "";
        String result = instance.getDiagnostico();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIndicaciones() {
        String expResult = "";
        String result = instance.getIndicaciones();
        assertEquals(expResult, result);
    }

}
