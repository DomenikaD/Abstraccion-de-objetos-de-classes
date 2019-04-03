/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.restaurante.clases;

/**
 *
 * @author Domenika Delgado
 */
public class Cliente {
    
    //Atributos de la clase Cliente
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;

    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    
    //Metodo para agregar un cliente nuevo
    public boolean agregarCliente(String nombre, String apellido, String cedula, String telefono){
        return false;
        
    }
    
    //Metodo para buscar un cliente por su numero de cedula
    public Cliente buscarCliente(String cedula){
        return null;
        
    }
    
    //Metodo para modificar los datos del cliente
    public boolean modificarCliente(String nombre, String apellido, String cedula, String telefono){
        return false;
        
    }
    
    
    //toString
     @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    
}
