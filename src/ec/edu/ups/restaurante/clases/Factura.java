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
public class Factura {
    
    //Atributos de la clase Factura
    private int codigo;
    private Date fecha;
    private double total;

    
    //Getters & Setters
    public int getCodigo() {
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Metodo para crea una factura con su codigo, la fecha y el total 
    public boolean crearFactuta(int codigo, Date fecha, double total){
        return false;
    }
    
    //Metodo para calcular el costo total de consumo
    public double calcularCosto(double total){
        return 0;
        
    }
    
    //Metodo que imprime toda la factura del cliente  
    public Factura imprimirFactura(int codigo){
        return null;
        
    }
    
    
    
    //toString
    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
}
