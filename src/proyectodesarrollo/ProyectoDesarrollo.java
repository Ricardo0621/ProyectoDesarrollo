/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodesarrollo;

import controladores.ControladorEmpleado;
import logica.Empleado;

/**
 *
 * @author diegoruiz
 */
public class ProyectoDesarrollo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        String id_empleado = "1130589899";
        
        //Crear empleado
        String id = "1340666252";
        String id_sede = "12345";
        String rol = "operador";
        String primer_nombre = "JOSE";
        String segundo_nombre = "L";
        String primer_apellido = "ORDOÑES";
        String segundo_apellido = "SILVS";
        String direccion = "CLLE 32 #45-56";
        String telefono = "4444444";
        String correo = "JOSE@gmail.com";
        String password = "pruebaS";
        String estado = "activo";
        
        /**
         * Crear empleados
         */
        if(!controladorEmpleado.consultarEmpleado(id)){
            if(controladorEmpleado.insertarEmpleado(id, id_sede, rol, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, correo, password, estado)>=1){
                System.out.println("Insertado Correctamente");
            }else{
                System.err.println("Error al insertar");
            }
        }else{
            System.err.println("Ya existe un empleado con ese id");
        }
        
        /**
         * Consultar empleado
         */
        if(controladorEmpleado.consultarEmpleado(id_empleado)){
            Empleado empleado = controladorEmpleado.extraerEmpleado(id_empleado);
        }else{
            System.err.println("No exixte un empleado con esa identificación");
        }
        
        /**
         * Modificar empleado
         */
        if(controladorEmpleado.consultarEmpleado(id_empleado)){
            Empleado empleado = new Empleado();
            empleado = controladorEmpleado.extraerEmpleado(id_empleado);
            System.out.println("Identificación: "+empleado.getIdentificacion());
            System.out.println("Sede: "+empleado.getIdSede());
            System.out.println("Cargo: "+empleado.getRol());
            System.out.println("Nombres y apellidos: "+empleado.getPrimerNombre()+" "+empleado.getSegundoNombre()+" "+empleado.getPrimerApellido()+" "+empleado.getSegundoApellido());
            System.out.println("Dirección: "+empleado.getDireccion());
            System.out.println("Telefono: "+empleado.getTelefono());
            System.out.println("Email: "+empleado.getCorreo());
            System.out.println("Password: "+empleado.getPassword());
            System.out.println("Estado: "+empleado.getEstado());
            
            /*Desactivando/Activando el usuario*/
            empleado.setEstado("activo");
            
            if(controladorEmpleado.editarEmpleado(empleado) >= 1){
                Empleado emp = new Empleado();
                emp = controladorEmpleado.extraerEmpleado(id_empleado);
                System.out.println("Se actualizó el campo estado = "+emp.getEstado());
            }
        }else{
            System.err.println("No exixte un empleado con esa identificación"); 
        }
    }
    
}
