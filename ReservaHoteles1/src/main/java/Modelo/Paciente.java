package scm.modelo;

import java.util.Date;
/**
 *
 * @author Jonathan Atancuri
 */
public class Paciente extends Persona {

    private char sexo;
    private Date fechaNacimiento;
    private String tipoSangre;
    private String procedencia;
    private String etnia;
    private String instruccion;

    public Paciente(int id, String cedula, String nombre, String apellido,
                    char sexo, Date fechaNacimiento, String tipoSangre,
                    String procedencia, String etnia, String instruccion) {
        super(id, cedula, nombre, apellido);
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.procedencia = procedencia;
        this.etnia = etnia;
        this.instruccion = instruccion;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getEtnia() {
        return etnia;
    }

    public String getInstruccion() {
        return instruccion;
    }
}