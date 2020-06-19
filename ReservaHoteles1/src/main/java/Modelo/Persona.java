/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jhonn
 */
/**
 *
 * @author Jonathan Atancuri, Luis Orellana
 */
public abstract class Persona {
    
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;

    protected Persona(int id, String cedula, String nombre, String apellido) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
  
    @Override
    public String toString() {
        return cedula + " | " + nombre + " " + apellido;
    }
}