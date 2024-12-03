/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;
import java.util.ArrayList;
import java.util.List;




public class Empleados {
    private String nombre;
    private int cd;
    private int salario;

    public Empleados(String nombre, int cd, int salario) {
        this.nombre = nombre;
        this.cd = cd;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCd() {
        return cd;
    }

    public int getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Cedula=" + cd +
                ", Salario=" + salario +
                '}';
    }
    
    //Constructor de la lista
    public static class AdminEmpleados {
        private List<Empleados> listaEmpleados;
        
        public AdminEmpleados(){
        this.listaEmpleados = new ArrayList<>();
        }
        
        public void agregarEmpleado(Empleados empleado) {
            listaEmpleados.add(empleado);
            System.out.println("Empleado agregado: " + empleado.getNombre());
        }
        
        public Empleados buscarEmpleadoCD(int codigo) {
            for (Empleados empleado : listaEmpleados) {
                if (empleado.getCd() == codigo) {
                    return empleado;
                }
            }
            return null; 
            
        }
        
        public boolean eliminarEmpleadoCD(int cd) {
            Empleados empleado = buscarEmpleadoCD(cd);
            if (empleado != null) {
                listaEmpleados.remove(empleado);
                System.out.println("Empleado eliminado: " + empleado.getNombre());
                return true;
            }
            return false;
        }
        
        public void mostrarEmpleados() {
            if (listaEmpleados.isEmpty()) {
                System.out.println("No hay empleados en la lista.");
            } else {
                System.out.println("Lista de empleados:");
                for (Empleados empleado : listaEmpleados) {
                    System.out.println(empleado);
                }
            }
        }
    }  
}
