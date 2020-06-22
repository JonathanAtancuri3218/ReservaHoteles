
package ControladorTest;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ControladorUsuarioTest {
    
    public ControladorUsuarioTest() {
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

  

    /**
     * Test of agregar method, of class ControladorUsuario.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregando...");
        Usuario usuario = new Usuario(20, "", "", "");
        boolean expResult = true;
        boolean result = ControladorUsuario.agregar(usuario);
        assertEquals(expResult, result);
        
        if(expResult==true){
        
            System.out.println("Usuario ingresado");
        }else{
        
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificar method, of class ControladorUsuario.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Usuario usuario = new Usuario(20,"","","");
        boolean expResult = ControladorUsuario.modificar("UsuarioTest1", usuario);
        boolean result = ControladorUsuario.modificar("USR1_P4", usuario);
       
        
         //assertEquals(expResult, result);

        if (result == false) {
            System.out.println("Actulizando Exitosamente");
        } else {

            fail("nose completo.");
        }
        
        
        
    }
    
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String nombreUsuario = "";
        boolean expResult = ControladorUsuario.eliminar(nombreUsuario);
        boolean result = ControladorUsuario.eliminar(nombreUsuario);
       // assertEquals(expResult, result);
        
        
        if(result==false){
        
            System.out.println("eiminado exitodamente");
            
        }else{
        
        fail("Fallo al eliminar.");
        }
        }

   
    
}
