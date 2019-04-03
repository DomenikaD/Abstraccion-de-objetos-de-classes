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
public class Empleado {
    
    //Atributos de la clase Empleado
    private String nombre;
    private String cargo;
    private int id;
    private double salario;

    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo para agregar un empleado nuevo
    public boolean agregarEmpleado(String nombre,int id, String cargo, double salario){
        return false;
    }
    
    //Metodo para buscar un empleado por su numero de ID
    public boolean buscarEmpleado(int id){
        return false;
    }
    
    //Metodo para modificar los datos del empleado
    public boolean modificarEmpleado(String nombre,int id, String cargo, double salario){
        return false;
    }
    
    //Metodo para eliminar un empleado
    public boolean emliminarEmpleado(int id){
        return false;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + ", salario=" + salario + '}';
    }
    
    
    
}
