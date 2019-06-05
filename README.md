# Abstraccion-de-objetos-de-classes
Practica 01 de abstraccion de objetos de classes

 	PRÁCTICA DE LABORATORIO 

CARRERA: Computación	ASIGNATURA: Programación Aplicada
NRO. PRÁCTICA:	1	TÍTULO PRÁCTICA: Abstracción de objetos a clases (POO)
OBJETIVO ALCANZADO: Modela aplicaciones de software mediante diagramas de clase.
ACTIVIDADES DESARROLLADAS
1. 10 objetos relacionados a tema de Restaurantes:

1.	Empleado: Ver el cargo que la persona tiene, cuanto es su salario y saber cuándo fue su fecha de ingreso al restaurante. 
2.	Menú: Nombre de los platos que existe en el restaurante con su precio y su descripción de cada uno de ellos. El menú hay uno por día (Ejemplo: lunes 3 de diciembre, Menú es sopa de fideo, sopa con fideos de forma de letras, etc.).
3.	Factura: Tener un control de los platos vendidos y dar comprobante al cliente para sus declaraciones para el SRI, tener la descripción y cantidad que el cliente haya consumido.
4.	Cliente: Detallar su información respectiva para hacer la factura de sus consumos del dicho restaurante.
5.	Mesa: Demostrar si está disponible en tal fecha que el cliente desea y si hay la capacidad suficiente para las personas solicitadas en dicha mesa. 
6.	Inventario: Cantidad de elementos que ingresan para realizar un plato (ejemplo: Ensalada de frutas: Piña, fresa, uvas, etc.)
7.	Utensilios: Saber la cantidad que existe dentro del restaurante de platos, cucharas, tenedores, cuchillos, entre otras.
8.	Bebidas: Describir que tamaño de bebida hay en el restaurante y que tipo es como por ejemplo sea cola, cerveza, vino, entre otros.
9.	Plato: Dar tos los ingredientes que se utilicen para realizar dicho plato sea arroz, lechuga, carne.
10.	Orden: Tener en cuenta el menú que adicione del día mas un plato sencillo y con bebida que va a ser detallo en la factura.

2. Diagrama de Clases

---------------------------------------------------------------------------------------------------
     Cliente
---------------------------------------------------------------------------------------------------
- nombre : String
- apellido : String
- cedula : String
- telefono : String
---------------------------------------------------------------------------------------------------
+ agregarCliente(nombre : String, apellido : String, cedula : String, telefono : String) : boolean
+ buscarCliente(cedula:String) : Cliente
+ modificarCliente(nombre : String, apellido : String, cedula : String, telefono : String) : boolean
---------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------
     Empleado
---------------------------------------------------------------------------------------------------
- nombre : String
- cargo : String
- id : int
- salario : double
---------------------------------------------------------------------------------------------------
+ agregarEmpleado(nombre : String, id : int, cargo : String, salario : double) : boolean
+ buscarEmpleado(id : int) : boolean
+ modificarEmpleado(nombre : String, id : int, cargo : String, salario : double) : boolean
+ eliminarEmpleado(id : int) : boolean
---------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------
   Factura
---------------------------------------------------------------------------------------------------
- codigo : int
- fecha : Date
- total : double
---------------------------------------------------------------------------------------------------
+ crearFactura(codigo : int, fecha : Date, total : double) : boolean
+ calcularCosto(total : double) : double
+ imprimirFactura( codigo : int ) : Factura 
---------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------
    Menu
---------------------------------------------------------------------------------------------------
- nombre : String
- descripcion: String
- precio : double
---------------------------------------------------------------------------------------------------
+ crearMenu(nombre : String, descripcion : String, precio : double) : boolean
+ modificarMenu(nombre : String) : void
+ eliminarMenu(nombre : String) : boolean
---------------------------------------------------------------------------------------------------


---------------------------------------------------------------------------------------------------
   Mesa
---------------------------------------------------------------------------------------------------
- codigo : int
- fecha : Date
- disponible : boolean
- cantidad : int 
---------------------------------------------------------------------------------------------------
+ verificarMesa(disponible : boolean) : boolean
+ reservarMesa(codigo : int, fecha : Date, cantidad : int) : boolean
+ cancelarReserva(codigo : int) : boolean
---------------------------------------------------------------------------------------------------
    
 
3. Clases

Clase Cliente

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
}


Clase Empleado

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
    
}

Clase Factura

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
}


Clase Menu

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
}


Clase Mesa

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
}

4. Implementar el método toString() en cada clase:

Metodo toString de Cliente

    //toString
     @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }

Metodo toString de Empleado

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + ", salario=" + salario + '}';
    }
    
Metodo toString de Factura

    //toString
    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
Metodo toString de Menu

    //toString
    @Override
    public String toString() {
        return "Menu{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
Metodo toString de Mesa

//toString
    @Override
    public String toString() {
        return "Mesa{" + "codigo=" + codigo + ", fecha=" + fecha + ", disponible=" + disponible + ", cantidad=" + cantidad + '}';
    }



5.  Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior muestre dicha información del objeto en la consola de Netbeans.
 
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
        
        //Para leer datos de la consola
        Scanner read = new Scanner(System.in);
        
        String res = null;
        do{
            
        //Impresion de opciones
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
        
        //lee lo que ingreso en consola
        opcion = read.nextInt();
        
        //Compara con las opciones
        switch (opcion){
            
            //Opcion para el Cliente
            case 1:
                
                //Instanciar la clase Cliente
                Cliente cli = new Cliente();
                
                //Impresion y leer 
                System.out.println("Ingrese los datos del Cliente");
                System.out.print("Nombre: ");
                String nom = read.next();
                
                System.out.print("Apellido: ");
                String ape =  read.next();
                
                System.out.print("Cedula: ");
                String ced = read.next();
                
                System.out.print("Telefono : ");
                String tel = read.next();
                
                //Poner valores a los atributos
                cli.setNombre(nom);
                cli.setApellido(ape);
                cli.setCedula(ced);
                cli.setTelefono(tel);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                //Impresion de los datos ingresados con el metodo get
                System.out.println("Nombre Completo : " + cli.getNombre() +" "+ cli.getApellido());
                System.out.println("Cedula : " + cli.getCedula());
                System.out.println("Telefono: " + cli.getTelefono());
                
                //Impresion del toString
                System.out.println(cli.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                break;
                
            case 2:
                
                //Instanciar la clase Empleado
                Empleado emp = new Empleado();
                
                //Impresion y leer 
                System.out.println("Ingrese los datos del Empleado");
                System.out.print("Nombre: ");
                String nomE = read.next();
                
                System.out.print("Cargo: ");
                String car =  read.next();
                
                System.out.print("ID: ");
                int idE = read.nextInt();
                
                System.out.print("Salario: ");
                double  sal = read.nextDouble();
                
                //Poner valores a los atributos
                emp.setNombre(nomE);
                emp.setCargo(car);
                emp.setId(idE);
                emp.setSalario(sal);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                //Impresion de los datos ingresados con el metodo get
                System.out.println("Nombre: " + emp.getNombre());
                System.out.println("Cargo: " + emp.getCargo());
                System.out.println("ID: " + emp.getId());
                System.out.println("Salario: " + emp.getSalario());
                
                //Impresion del toString
                System.out.println(emp.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                break;
                
            case 3:
                
                //Instanciar la clase Factura
                Factura fac = new Factura();
                
                //Impresion y leer 
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
 
                //Impresion y leer 
                System.out.print("Total: ");
                double tot = read.nextDouble();
                
                //Poner valores a los atributos
                fac.setCodigo(cod);
                fac.setFecha(date);
                fac.setTotal(tot);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                //Impresion de los datos ingresados con el metodo get
                System.out.println("Codigo de Factura: " + fac.getCodigo());
                System.out.println("Fecha: " + fac.getFecha().toLocaleString());//Para que me salga la fecha y la hora
                System.out.println("Total: " + fac.getTotal());
                
                //Impresion del toString
                System.out.println(fac.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                
                break;
                
            case 4:
                
                //Instanciar la clase Menu
                Menu men = new Menu();
               
                //Impresion y leer 
                System.out.println("Ingrese su Menu");
                System.out.print("Nombre del Platp: ");
                String nomM = read.next();
                
                System.out.print("Descripcion del Plato: ");
                String des =  read.next();
                
                System.out.print("Precio del Plato: ");
                double pre = read.nextDouble();
                
                //Poner valores a los atributos
                men.setNombre(nomM);
                men.setDescripcion(des);
                men.setPrecio(pre);
                
                
                System.out.println(" ");
                
                System.out.println("*******************Su Menu**********************");
                
                //Impresion de los datos ingresados con el metodo get
                System.out.println("Nombre del Plato: " + men.getNombre());
                System.out.println("Descripcion del Plato: " + men.getDescripcion());
                System.out.println("Precio del Plato: " + men.getPrecio());
                
                //Impresion del toString
                System.out.println(men.toString());
           
                System.out.println("*************************************************");
                
                res = "si";

                break;
                
            case 5:
                
                //Instanciar la clase Mesa
                Mesa mes = new Mesa();
     
                //Impresion y leer 
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
                
                //Impresion y leer 
                System.out.print("Cantidad de Personas:  ");
                int cant= read.nextInt();
              
                //Poner valores a los atributos
                mes.setCodigo(codM);
                mes.setFecha(date);
                mes.setCantidad(cant);
                
                System.out.println(" ");
                
                System.out.println("*****************Sus Datos**********************");
                
                //Impresion de los datos ingresados con el metodo get
                System.out.println("Codigo de la Mesa: " + mes.getCodigo());
                System.out.println("Fecha de Reserva: " + mes.getFecha());
                System.out.println("La Cantidad de personas en la Mesa: " + mes.getCantidad());
                
                //Impresion del toString
                System.out.println(mes.toString());
           
                System.out.println("*************************************************");
                
                res = "si";
                  break;
                
            case 6:
                //Salir del bucle do while
                res="no";
                
                break;      
        }
        
        }while(res.equalsIgnoreCase("si"));
        
        System.out.println(" Gracias ");
        
    }
    
}

6. GitHub

Usuario: DomenikaD

Link: https://github.com/DomenikaD/Practica-01--Abstraccion-de-objetos-de-clases


![1](https://user-images.githubusercontent.com/49033904/58931136-19a00280-8724-11e9-80fe-410dee70b2af.png)


RESULTADO(S) OBTENIDO(S): 

Resultados de Consola
~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->1
Ingrese los datos del Cliente
Nombre: Dome
Apellido: Delgado
Cedula: 1717273401
Telefono : 0998700282
*****************Sus Datos**********************
Nombre Completo : Dome Delgado
Cedula : 1717273401
Telefono: 0998700282
Cliente{nombre=Dome, apellido=Delgado, cedula=1717273401, telefono=0998700282}
*************************************************
~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->2
Ingrese los datos del Empleado
Nombre: Sofia
Cargo: Chef
ID: 0204
Salario: 500


*****************Sus Datos**********************
Nombre: Sofia
Cargo: Chef
ID: 204
Salario: 500.0
Empleado{nombre=Sofia, cargo=Chef, id=204, salario=500.0}
~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->3
Ingrese datos de Factura
Codigo: 01
Fecha: 03-12-2019
Total: 45
 
*****************Sus Datos**********************
Codigo de Factura: 1
Fecha: Dec 3, 2019 12:00:00 AM
Total: 45.0
Factura{codigo=1, fecha=Tue Dec 03 00:00:00 COT 2019, total=45.0}
*************************************************

~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->4
Ingrese su Menu
Nombre del Platp: ensalada
Descripcion del Plato: frances
Precio del Plato: 10
 
*******************Su Menu**********************
Nombre del Plato: ensalada
Descripcion del Plato: frances
Precio del Plato: 10.0
Menu{nombre=ensalada, descripcion=frances, precio=10.0}
*************************************************

~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->5
Ingrese los datos de la Mesa
Codigo: 05
Fecha de Reserva: 4-3-2019
Cantidad de Personas:  6
*****************Sus Datos**********************
Codigo de la Mesa: 5
Fecha de Reserva: Mon Mar 04 00:00:00 COT 2019
La Cantidad de personas en la Mesa: 6
Mesa{codigo=5, fecha=Mon Mar 04 00:00:00 COT 2019, disponible=false, cantidad=6}
*************************************************
~~~~~~~Escoga una opcion~~~~~~~
1. Crear objeto de tipo Cliente
2. Crear objeto de tipo Empleado
3. Crear objeto de tipo Factura
4. Crear objeto de tipo Menu
5. Crear objeto de tipo Mesa
6. Salir
-->6
 Gracias
 
 
CONCLUSIONES: En esta práctica nos ayudó mucho para entender el get y set y los diferentes métodos de cada clase y tener en cuenta que en algunos métodos se mandan valores(variables).
RECOMENDACIONES: Tener en cuenta sobre la fecha en Date porque se nos puede complicar un poco cuando no se poner en el formato correcto.

Nombre de estudiante: Domenika Delgado

Firma:



![9](https://user-images.githubusercontent.com/49033904/58777938-6b5e5680-8585-11e9-9b2e-bdbfd1958f5b.png)

