/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;




public class Principal {

    public static void main(String[] args) {
        
        
        Empresa empresa1=new Empresa("TUTI",123456789,"calle el cinche","tuti@gmail.com");
      
        System.out.println("Nombre de la empresa:    "+empresa1.getNombre());
        System.out.println("RUC de la empresa:       "+empresa1.getRuc());
        System.out.println("Direccion de la empresa: "+empresa1.getDireccion());
        System.out.println("EMAIL de la empresa:     "+empresa1.getEmail());
        System.out.println("");
        Empleados.AdminEmpleados admin=new Empleados.AdminEmpleados();
        
        Empleados empleado1=new Empleados("Carlos Andres",123456789,450);
        Empleados empleado2=new Empleados("Juan Perez",123456788,450);
        Empleados empleado3=new Empleados("Alverto Rios",123456777,450);
        Empleados empleado4=new Empleados("Dilan Simba",1234566666,450);
        
        admin.agregarEmpleado(empleado1);
        admin.agregarEmpleado(empleado2);
        admin.agregarEmpleado(empleado3);
        admin.agregarEmpleado(empleado4);
        
        System.out.println("");
        admin.mostrarEmpleados();
        System.out.println("");

        int CDbuscar=123456789;
        Empleados empleadoEncontrado = admin.buscarEmpleadoCD(CDbuscar);
        System.out.println("Empleado encontrado: " + empleadoEncontrado);
        System.out.println("");

        int CDeliminar = 123456777;
        boolean eliminado = admin.eliminarEmpleadoCD(CDeliminar);
        
        System.out.println("");
        
        admin.mostrarEmpleados();
    }
}
