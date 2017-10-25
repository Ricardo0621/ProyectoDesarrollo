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
        String sql = "SELECT id FROM empleados WHERE id="+id_empleado+"::varchar";
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
        } catch(SQLException e){ 
            System.out.println(e); 
        } catch(Exception e){ 
            System.out.println(e); 
        }
        return result;
    }//Fin consultar Empleado
    
    public Empleado recuperarEmpleado(String id_empleado){
        Empleado empleado = new Empleado();
        String sql = "SELECT * FROM empleados WHERE id="+id_empleado+"::varchar";
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
            //fachada.closeConection(conn);
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
            //fachada.closeConection(conn);
            return filas_guardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        return -1;
    }//Fin de modificarEmpleado
    
    public void listarEmpleado(){}
    public void borrarEmpleado(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
