/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author jhonn
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
              con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=(Statement) cn.con.createStatement();
            rs=st.executeQuery("select * from usuarios");
            while (rs.next()) {                
                System.out.println(rs.getInt("codigo")+" " +rs.getString("contraseña")+" " +rs.getString("rol"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }
}