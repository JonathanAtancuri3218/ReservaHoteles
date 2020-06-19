package scm.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import scm.modelo.Cita;
import scm.modelo.Consulta;

/**
 * Metodo para agregar consulta
 *
 * @author Jonathan Atancuri
 */
public class ControladorConsulta {

    public static int generarID() {
        String sql = "select max(id) from consultas";
        return ConexionDB.generarID(sql);
    }
    
    public static boolean agregar(Consulta consulta) {

        // if (buscar(consulta.getId()) != null) {
        String sql = "insert into consultas values("
                + consulta.getId() + ", '"
                + consulta.getCita().getId() + "', '"
                + consulta.getSintomas() + "', '"
                + consulta.getDiagnostico() + "', "
                + consulta.getPresionArterial() + ", "
                + consulta.getFrecuenciaCardiaca() + ", "
                + consulta.getFrecuenciaRespiratoria() + ", "
                + consulta.getTemperaturaCorporal() + ", "
                + consulta.getPeso() + ", "
                + consulta.getAltura() + ", "
                + consulta.getIndiceMasa() + ", '"
                + consulta.getReceta() + "', '"
                + consulta.getIndicaciones() + "');";

        ConexionDB.ejecutarSentencia(sql);
        System.out.println("insertando...");
        System.out.println(sql);
        return true;
    }

    public static boolean modificar(Consulta consulta) {

        // if (buscar(id)!= null){
        String sql = "update consultas set "
                + "sintomas ='" + consulta.getSintomas() + "', "
                + "diagonostico = '" + consulta.getDiagnostico() + "',"
                + "pa = " + consulta.getPresionArterial() + ","
                + "fc = " + consulta.getFrecuenciaCardiaca() + ","
                + "fr = " + consulta.getFrecuenciaRespiratoria() + ","
                + "tc = " + consulta.getTemperaturaCorporal() + ","
                + "peso = " + consulta.getPeso() + ","
                + "altura = " + consulta.getAltura() + ","
                + "imc = " + consulta.getIndiceMasa() + ","
                + "receta = '" + consulta.getReceta() + "',"
                + "indicaciones = '" + consulta.getIndicaciones() + "'"
                + "where id = " + consulta.getId();
        ConexionDB.ejecutarSentencia(sql);
        System.out.println("Modificando....");
        System.out.println("" + sql);
        return true;
    }

    /**
     * Meotod para listar (corregido)
     *
     * @return lista de consultas
     */
    public static List<Consulta> listar() {
        List<Consulta> lista = new ArrayList();
        String sql = "select * from consultas";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                int idcita = resultado.getInt("idcita");
                String sintomas = resultado.getString("sintomas");
                String diagnostico = resultado.getString("diagonostico");
                float pa = resultado.getFloat("pa");
                float fc = resultado.getFloat("fc");
                float fr = resultado.getFloat("fr");
                float tc = resultado.getFloat("tc");
                float peso = resultado.getFloat("peso");
                float altura = resultado.getFloat("altura");
                String receta = resultado.getString("receta");
                String indicaciones = resultado.getString("indicaciones");
                Cita cita = ControladorCita.buscar(idcita);
                lista.add(new Consulta(id, cita, sintomas, diagnostico, altura,
                          pa, fc, fr, peso, altura, receta, indicaciones));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;

    }


    public static boolean eliminar(int id) {
        String sql = "delete from consultas where id = " + id + "";
        ConexionDB.ejecutarSentencia(sql);
        System.out.println(sql);
        System.out.println("eliminado.....");
        return true;
    }
}