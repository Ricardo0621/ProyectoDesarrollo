/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;
import java.sql.*;
import logica.Empleado;

/**
 *
 * @author diegoruiz
 */
public class DaoEmpleado {
    FachadaBD fachada;
    
    public DaoEmpleado(){
        fachada = new FachadaBD();
    }
    public int guardarEmpleado(Empleado e){
        int filasGuardadas = 0;
        String sql = "";
        sql = "INSERT INTO empleados "+
              "(id,id_sede, rol, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email, password, estado)"+
              " VALUES "+
              "('"+e.getIdentificacion()+"','"+e.getIdSede()+"','"+e.getRol()+"','"+e.getPrimerNombre()+"','"+e.getSegundoNombre()+"','"+e.getPrimerApellido()+"','"+e.getSegundoApellido()+"','"+e.getDireccion()+"','"+e.getTelefono()+"','"+e.getCorreo()+"','"+e.getPassword()+"','"+e.getEstado()+"')";
              System.out.println(sql);
        try {
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql);            
            System.out.println("up " + filasGuardadas);
            //fachada.closeConection(conn);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        return -1;
    }//Fin guardar empleado
    
    public boolean consultarEmpleado(String id_empleado){
        String sql = "SELECT id FROM empleados WHERE id='"+id_empleado+"'";
        boolean result = false;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            //fachada.closeConection(conn);
            if(tabla.next()){
                result = true;
            }else{
                result = false;
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
        } catch(SQLException e){ 
            System.out.println(e); 
        } catch(Exception e){ 
            System.out.println(e); 
        }
        return result;
    }//Fin consultar Empleado
    
    public Empleado recuperarEmpleado(String id_empleado){
        Empleado empleado = new Empleado();
        String sql = "SELECT * FROM empleados WHERE id='"+id_empleado+"'";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                empleado.setIdentificacion(tabla.getString(1));
                empleado.setIdSede(tabla.getString(2));
                empleado.setRol(tabla.getString(3));
                empleado.setPrimerNombre(tabla.getString(4));
                empleado.setSegundoNombre(tabla.getString(5));
                empleado.setPrimerApellido(tabla.getString(6));
                empleado.setSegundoApellido(tabla.getString(7));
                empleado.setDireccion(tabla.getString(8));
                empleado.setTelefono(tabla.getString(9));
                empleado.setCorreo(tabla.getString(10));
                empleado.setPassword(tabla.getString(11));
                empleado.setEstado(tabla.getString(12));
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
            return empleado;
        } catch(SQLException e){ 
            System.out.println(e); 
        } catch(Exception e){ 
              System.out.println(e); 
        }
        

        return empleado;
    }//Fin de recuperar empleado
    
    public int modificarEmpleado(Empleado e){
        String sql = "UPDATE empleados SET id_sede='"+e.getIdSede()+"', rol='"+e.getRol()+"', primer_nombre='"+e.getPrimerNombre()+
                     "', segundo_nombre='"+e.getSegundoNombre()+"', primer_apellido='"+e.getPrimerApellido()+"', segundo_apellido='"+e.getSegundoApellido()+
                     "', direccion='"+e.getDireccion()+"', telefono='"+e.getTelefono()+"', email='"+e.getCorreo()+"', password='"+e.getPassword()+"',estado='"+e.getEstado()+"' WHERE id='"+e.getIdentificacion()+"'";
        int filas_guardadas = -1;
        try {
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            filas_guardadas = sentencia.executeUpdate(sql);            
            System.out.println("up " + filas_guardadas);
            sentencia.close();
            conn.close();
            return filas_guardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        return -1;
    }//Fin de modificarEmpleado
    
    public Empleado[] listarEmpleados(String id_sede, String rol, String estado){
        Empleado[] empleados;
        Empleado empleado;
        String sql_count;
        String sql;
        boolean sql_and = false;
        if(!id_sede.equals("Todos") || !rol.equals("Todos") || !estado.equals("Todos")){
            sql_count = "SELECT COUNT(*) AS filas FROM empleados WHERE ";
            sql = "SELECT * FROM empleados WHERE ";
            sql_and = false;
        }else{
            sql_count = "SELECT COUNT(*) AS filas FROM empleados";
            sql = "SELECT * FROM empleados";
        }
        if(!id_sede.equals("Todos")){
            if(sql_and){
                sql_count += "AND id_sede='"+id_sede+"'";
                sql += "AND id_sede='"+id_sede+"'";
                sql_and = true;
            }else{
                sql_count += "id_sede='"+id_sede+"'";
                sql += "id_sede='"+id_sede+"'";
                sql_and = true;
            }   
        }
        if(!rol.equals("Todos")){
            if(sql_and){
                sql_count += "AND rol='"+rol+"'";
                sql += "AND rol='"+rol+"'";
                sql_and = true;
            }else{
                sql_count += "rol='"+rol+"'";
                sql += "rol='"+rol+"'";
                sql_and = true;
            }   
        }
        if(!estado.equals("Todos")){
            if(sql_and){
                sql_count += "AND estado='"+estado+"'";
                sql += "AND estado='"+estado+"'";
                sql_and = true;
            }else{
                sql_count += "estado='"+estado+"'";
                sql += "estado='"+estado+"'";
                sql_and = true;
            }   
        }
        
        int filas = 0;
        int contador = 0;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            empleados = new Empleado[filas];
            tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                empleado = new Empleado();
                empleado.setIdentificacion(tabla.getString(1));
                empleado.setIdSede(tabla.getString(2));
                empleado.setRol(tabla.getString(3));
                empleado.setPrimerNombre(tabla.getString(4));
                empleado.setSegundoNombre(tabla.getString(5));
                empleado.setPrimerApellido(tabla.getString(6));
                empleado.setSegundoApellido(tabla.getString(7));
                empleado.setDireccion(tabla.getString(8));
                empleado.setTelefono(tabla.getString(9));
                empleado.setCorreo(tabla.getString(10));
                empleado.setPassword(tabla.getString(11));
                empleado.setEstado(tabla.getString(12));
                empleados[contador] = empleado;
                contador++;
            }
            /*tabla.close();
            sentencia.close();
            conn.close();*/
            return empleados;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        empleados = null; //Asumiendo que no hayan sedes
        return empleados;
    }
    
    public void listarEmpleado(){}
    public void borrarEmpleado(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
