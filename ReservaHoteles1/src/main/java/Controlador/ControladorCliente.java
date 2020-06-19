/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Ricardo Chuqui Andres Guaycha Jhonatan Atancuri Diego Castro
 */
public class ControladorCliente {
  private List<Cliente> listaCliente;

    public ControladorCliente() 
    {
        listaCliente = new ArrayList<>();
    }
    /**
     * Metodo que me permite crear una persona
     * @param persona 
     */
    
    public void crear(Cliente cliente)
    {
        listaCliente.add(cliente); 
    }

    public List<Cliente> getListaPersona() {
        return listaCliente;
    }

    public void setListaPersona(List<Cliente> listaPersona) {
        this.listaCliente = listaPersona;
    } 
    
}
