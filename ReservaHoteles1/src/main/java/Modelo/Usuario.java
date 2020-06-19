package scm.modelo;

/**
 *
 * @author Jonathan Atancuri
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String clave;
    private String rol;

    public Usuario(int id, String nombre, String clave, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }
}