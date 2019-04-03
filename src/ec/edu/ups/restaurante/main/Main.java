package ec.edu.ups.restaurante.main;

import ec.edu.ups.restaurante.clases.Cliente;
import ec.edu.ups.restaurante.clases.Empleado;
import ec.edu.ups.restaurante.clases.Factura;
import ec.edu.ups.restaurante.clases.Menu;
import ec.edu.ups.restaurante.clases.Mesa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Domenika Delgado
 * Programacion Orientada a Objetos
 * Desarrollo de un programa sobre un Restuarante con sus clases y metodos 
 */
public class Main {

    public static void main(String[] args) {
        
        int opcion;
        
        Date date=null;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");//Formato en que va a recibir el String
        
        Scanner read = new Scanner(System.in);
        
        String res = null;
        do{
        System.out.println("");
        System.out.println("~~~~~~~Escoga una opcion~~~~~~~");
        System.out.println("1. Crear objeto de tipo Cliente");
        System.out.println("2. Crear objeto de tipo Empleado");
        System.out.println("3. Crear objeto de tipo Factura");
        System.out.println("4. Crear objeto de tipo Menu");
        System.out.println("5. Crear objeto de tipo Mesa");
        System.out.println("6. Salir");
        System.out.print("-->");
        System.out.print("");
        
        opcion = read.nextInt();
        
        switch (opcion){
            case 1:
                
                Cliente cli = new Cliente();
                
                System.out.println("Ingrese los datos del Cliente");
                System.out.print("Nombre: ");
                String nom = read.next();
                
                System.out.print("Apellido: ");
                String ape =  read.next();
                
                System.out.print("Cedula: ");
                String ced = read.next();
                
                System.out.print("Telefono : ");
                String tel = read.next();
                
                cli.setNombre(nom);
                cli.setApellido(ape);
                cli.setCedula(ced);
                cli.setTelefono(tel);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                System.out.println("Nombre Completo : " + cli.getNombre() +" "+ cli.getApellido());
                System.out.println("Cedula : " + cli.getCedula());
                System.out.println("Telefono: " + cli.getTelefono());
                
                System.out.println(cli.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                break;
                
            case 2:
                
                Empleado emp = new Empleado();
                
                System.out.println("Ingrese los datos del Empleado");
                System.out.print("Nombre: ");
                String nomE = read.next();
                
                System.out.print("Cargo: ");
                String car =  read.next();
                
                System.out.print("ID: ");
                int idE = read.nextInt();
                
                System.out.print("Salario: ");
                double  sal = read.nextDouble();
                
                emp.setNombre(nomE);
                emp.setCargo(car);
                emp.setId(idE);
                emp.setSalario(sal);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                System.out.println("Nombre: " + emp.getNombre());
                System.out.println("Cargo: " + emp.getCargo());
                System.out.println("ID: " + emp.getId());
                System.out.println("Salario: " + emp.getSalario());
                
                System.out.println(emp.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                
                break;
                
            case 3:
                
                Factura fac = new Factura();
                
                System.out.println("Ingrese datos de Factura");
                System.out.print("Codigo: ");
                int cod = read.nextInt();
                
                System.out.print("Fecha: ");
                String fec =  read.next();
                
                //Fecha
                try {//Controla si la fecha esta esta en el formato dd-MM-yyyy 
                    date=formato.parse(fec);
                } catch (ParseException a) {
                    a.printStackTrace();
                }
 
                System.out.print("Total: ");
                double tot = read.nextDouble();
                
                fac.setCodigo(cod);
                fac.setFecha(date);
                fac.setTotal(tot);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                System.out.println("Codigo de Factura: " + fac.getCodigo());
                System.out.println("Fecha: " + fac.getFecha().toLocaleString());//Para que me salga la fecha y la hora
                System.out.println("Total: " + fac.getTotal());
                
                
                System.out.println(fac.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                break;
                
            case 4:
                
                Menu men = new Menu();
               
                System.out.println("Ingrese su Menu");
                System.out.print("Nombre del Platp: ");
                String nomM = read.next();
                
                System.out.print("Descripcion del Plato: ");
                String des =  read.next();
                
                System.out.print("Precio del Plato: ");
                double pre = read.nextDouble();
                
                men.setNombre(nomM);
                men.setDescripcion(des);
                men.setPrecio(pre);
                
                
                System.out.println(" ");
                
                System.out.println("*******************Su Menu**********************");
                
                System.out.println("Nombre del Plato: " + men.getNombre());
                System.out.println("Descripcion del Plato: " + men.getDescripcion());
                System.out.println("Precio del Plato: " + men.getPrecio());
                
                System.out.println(men.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                
                
               
                break;
                
            case 5:
                
                Mesa mes = new Mesa();
     
                System.out.println("Ingrese los datos de la Mesa");
                System.out.print("Codigo: ");
                int codM = read.nextInt();
                
                System.out.print("Fecha de Reserva: ");
                String fecM =  read.next();
                
                //Fecha
                try {//Controla si la fecha esta esta en el formato dd-MM-yyyy 
                    date=formato.parse(fecM);
                } catch (ParseException a) {
                    a.printStackTrace();
                }
                
                System.out.print("Cantidad de Personas:  ");
                int cant= read.nextInt();
              
                mes.setCodigo(codM);
                mes.setFecha(date);
                mes.setCantidad(cant);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                System.out.println("Codigo de la Mesa: " + mes.getCodigo());
                System.out.println("Fecha de Reserva: " + mes.getFecha());
                System.out.println("La Cantidad de personas en la Mesa: " + mes.getCantidad());
                
                System.out.println(mes.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                        
                
                break;
                
            case 6:
                
                res="no";
                
                break;
                
        }
        
        }while(res.equalsIgnoreCase("si"));
        
        System.out.println(" Gracias ");
    
                
        
        
    }
    
}
