/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodesarrollo;

import controladores.ControladorEmpleado;
import controladores.ControladorSede;
import gui.RegistrarSedes;
import gui.UserPanel;
import logica.Empleado;
import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class ProyectoDesarrollo {
    /**
     * @param args the command line arguments
     */
    public void testCrearUsuario(){
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        String id_empleado = "1130589899";
        UserPanel userPanel = new UserPanel(id_empleado);
        userPanel.setVisible(true);
        
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
            String[] datos_empleado = controladorEmpleado.extraerEmpleado(id_empleado);
        }else{
            System.err.println("No exixte un empleado con esa identificación");
        }
        
        /**
         * Modificar empleado
         */
        if(controladorEmpleado.consultarEmpleado(id_empleado)){
            String[] datos_empleados = controladorEmpleado.extraerEmpleado(id_empleado);
            System.out.println("Identificación: "+datos_empleados[0]);
            System.out.println("Sede: "+datos_empleados[1]);
            System.out.println("Cargo: "+datos_empleados[2]);
            System.out.println("Nombres y apellidos: "+datos_empleados[3]+" "+datos_empleados[4]+" "+datos_empleados[5]+" "+datos_empleados[6]);
            System.out.println("Dirección: "+datos_empleados[7]);
            System.out.println("Telefono: "+datos_empleados[8]);
            System.out.println("Email: "+datos_empleados[9]);
            System.out.println("Password: "+datos_empleados[10]);
            System.out.println("Estado: "+datos_empleados[11]);
        }else{
            System.err.println("No exixte un empleado con esa identificación"); 
        }
    }//Fin de testCreaUsuario()
    
    public void testCrearSede()
    {
        /*ControladorSede controladorSede = new ControladorSede();
        String identificacion = "12346";
        String id_empleado = "1130589899";
        String nombre = "Ricardo";
        String direccion = "Cra 2 #12-21";
        String telefono = "3234566";
        String director = "Ricardo";
        String fecha_creacion = "2017-10-23 10:52:00";
        
        controladorSede.registrarSede(identificacion,id_empleado, nombre, direccion,telefono, fecha_creacion);
        
        Sede sede = new Sede();*/
    }
    public static void main(String[] args) {
        ProyectoDesarrollo proyectoDesarrollo = new ProyectoDesarrollo();
        proyectoDesarrollo.testCrearSede(); 
    } 
}
