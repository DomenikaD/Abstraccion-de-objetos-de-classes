/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.restaurante.clases;

import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public class Mesa {
    
    //Atributos de clase Mesa
    private int codigo;
    private Date fecha;
    private boolean disponible;
    private int cantidad;
    
     //Getters & Setters
    
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {    
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isDisponible() {   
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCantidad() {
        return cantidad;
    }

   
    public void setCantidad(int cantidad) {    
        this.cantidad = cantidad;
    }

    //Metodo para verificar si la mesa esta disponible(Ocupada/Vacia)
    public boolean verificarMesa(boolean disponible) {
        return false;
    }
    
    //Metodo para reservar la mesa en una fecha requerida
    public boolean reservarMesa(int codigo, Date fecha, int cantidad ){
        return false;
    }
    
    //Metodo para anular la reserva de la Mesa si el cliente lo desea
    public boolean cancelarReserva(int codigo){
        return false;
    }
    
    //toString
    @Override
    public String toString() {
        return "Mesa{" + "codigo=" + codigo + ", fecha=" + fecha + ", disponible=" + disponible + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
    
}
