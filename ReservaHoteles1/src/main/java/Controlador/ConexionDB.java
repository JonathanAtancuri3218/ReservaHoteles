package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import scm.modelo.Usuario;

/**
 *
 * @author Jonathan Atancuri
 * 
 * 
 * 
 */


/**
 * 
 * @Pruba 
 */

public class ConexionDB {
    
    private static Usuario usuarioSesion;
    
    private static Connection conectar() {
        Connection conexion = null;
        String url =  "jdbc:mysql://localhost:90/hotel"; 
        try {
            Class.forName("org.mysql.Driver");
            conexion = DriverManager.getConnection(url, "hotel", "cuenca");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return conexion;
    }
    
    public static boolean ejecutarSentencia(String sql) {
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            conexion.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error sentencia: " + e.getMessage());
        }
        return false;
    }
    
    public static ResultSet ejecutarConsulta(String sql) {
        ResultSet resultado = null;
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            resultado.setFetchDirection(ResultSet.FETCH_FORWARD);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
        }
        return resultado;
    }

    public static Usuario getUsuarioSesion() {
        return usuarioSesion;
    }

    public static void setUsuarioSesion(Usuario usuarioSesion) {
        ConexionDB.usuarioSesion = usuarioSesion;
    }
    
    public static int generarID(String sql) {
        int id = 0;
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                id = resultado.getInt("max") + 1;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return id;
    }
}