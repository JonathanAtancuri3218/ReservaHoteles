/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class ControladorPersona {
  private List<Persona> listaPersona;

    public ControladorPersona() 
    {
        listaPersona = new ArrayList<>();
    }
    /**
     * Metodo que me permite crear una persona
     * @param persona 
     */
    
    public void crear(Persona persona)
    {
        listaPersona.add(persona); 
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }    
}
