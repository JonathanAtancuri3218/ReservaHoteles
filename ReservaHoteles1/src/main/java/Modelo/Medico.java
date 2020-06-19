package scm.modelo;

/**
 *
 * @author Jonathan Atancuri
 */
public class Medico extends Persona {

    private String direccion;
    private String email;
    private String especialidad;
    private Usuario usuario;

    public Medico(int id, String cedula, String nombre, String apellido, 
                  String direccion, String email, String especialidad,
                  Usuario usuario) {
        super(id, cedula, nombre, apellido);
        this.direccion = direccion;
        this.email = email;
        this.especialidad = especialidad;
        this.usuario = usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}