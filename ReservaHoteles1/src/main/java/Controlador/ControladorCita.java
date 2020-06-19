/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import scm.modelo.Cita;
import scm.modelo.Medico;
import scm.modelo.Paciente;

/**
 *
 * @author Jonathan Atancuri
 */
public class ControladorCita {

    public static int generarID() {
        String sql = "select max(id) from citas";
        return ConexionDB.generarID(sql);
    }

    public static boolean agregar(Cita cita) {
        if (buscar(cita.getId()) == null) {
            Date fecha = cita.getFecha();
            long cadenaFecha = fecha.getTime();
            String sql = "insert into citas values("
                + cita.getId() + ", '"
                + cadenaFecha + "', '"
                + cita.getHora() + "', '"
                + cita.getMotivo() + "', '"
                + cita.getMedico().getCedula() + "', '"
                + cita.getPaciente().getCedula() + "', '"
                + cita.getEstado() + "')";
            ConexionDB.ejecutarSentencia(sql);
            System.out.println("insertando...");
            return true;
        }
        return false;
    }

    public static boolean modificar(Cita cita) {
        if(buscar(cita.getId()) != null) {
            String sql = "update citas set "
                + "fecha = '" + cita.getFecha().getTime() + "',"
                + "hora = '" + cita.getHora() + "', "
                + "motivo = '" + cita.getMotivo() + "', "
                + "idmedico = '" + cita.getMedico().getCedula() + "', "
                + "idpaciente = '" + cita.getPaciente().getCedula() + "' "
                + "where id = " + cita.getId();
            ConexionDB.ejecutarSentencia(sql);
            System.out.println("Modificando...");
            return true;
        }
        return false;
    }

    public static boolean eliminar(int id) {
        if (buscar(id) != null) {
            String sql = "delete from citas where id = '" + id + "'";
            ConexionDB.ejecutarSentencia(sql);
            return true;
        }
        return false;
    }

    public static Cita buscar(int id) {
        Cita cita = null;
        String sql = "select * from citas where id = '" + id + "'";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                String fechaNoFormateada = resultado.getString("fecha");
                String hora = resultado.getString("hora");
                String motivo = resultado.getString("motivo");
                String idMedico = resultado.getString("idMedico");
                String idPaciente = resultado.getString("idPaciente");
                String estado = resultado.getString("estado");
                Medico medico = (Medico) ControladorPersona.buscar(idMedico, "medico");
                Paciente paciente = (Paciente) ControladorPersona.buscar(idPaciente, "paciente");
                Date fechaFormateada = new Date(Long.valueOf(fechaNoFormateada));
                cita = new Cita(id, fechaFormateada, hora, motivo, medico, paciente, estado);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        return cita;
    }

    public static List<Cita> listar() {
        List<Cita> lista = new ArrayList();
        String sql = "select * from citas";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String fechaNoFormateada = resultado.getString("fecha");
                String hora = resultado.getString("hora");
                String motivo = resultado.getString("motivo");
                String idMedico = resultado.getString("idMedico");
                String idPaciente = resultado.getString("idPaciente");
                String estado = resultado.getString("estado");
                Medico medico = (Medico) ControladorPersona.buscar(idMedico, "medico");
                Paciente paciente = (Paciente) ControladorPersona.buscar(idPaciente, "paciente");
                Date fechaFormateada = new Date(Long.valueOf(fechaNoFormateada));
                lista.add(new Cita(id, fechaFormateada, hora, motivo, medico, paciente, estado));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
    
    public static List<Cita> listarCitasEspecificas(String idPaciente) {
        List<Cita> lista = new ArrayList();
        String sql = "select * from citas where idPaciente = '" + idPaciente + "'";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {
                int idCita = resultado.getInt("id");
                String fechaNoFormateada = resultado.getString("fecha");
                String hora = resultado.getString("hora");
                String motivo = resultado.getString("motivo");
                String idMedico = resultado.getString("idMedico");
                String estado = resultado.getString("estado");
               
                Medico medico = (Medico) ControladorPersona.buscar(idMedico, "medico");
                Paciente paciente = (Paciente) ControladorPersona.buscar(idPaciente, "paciente");
                Date fechaFormateada = new Date(Long.valueOf(fechaNoFormateada));
                
                lista.add(new Cita(idCita, fechaFormateada, hora, motivo, medico, paciente, estado));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
}