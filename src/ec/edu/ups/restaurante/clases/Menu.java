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
public class Menu {
    
    //Atributos de la clase Menu
    private String nombre;
    private String descripcion;
    private double precio;

    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodo para crear un menu con su respectivas atributos
    public boolean crearMenu(String nombre, String descripcion, double precio){
        return false;
    }
    
    //Metodo para modificar algo del menu 
    public void modificarMenu(String nombre){
        
    }
    
    //Metodo para eliminar el menu
    public boolean eliminarMenu(String nombre){
        return false;
    }
    
    //toString
    @Override
    public String toString() {
        return "Menu{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
