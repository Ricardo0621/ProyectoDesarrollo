/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
import logica.Sede;

/**
 *
 * @author diegoruiz
 */
public class DaoSede {
    FachadaBD fachada;
    
    public DaoSede(){
        fachada = new FachadaBD();
    }
    public int guardarSede(){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Sede consultarAsistente(){
        Sede sede = null;
        return sede;
    }
    public int modificarSede(Sede sede ){
       
        String sql_modificar;
        sql_modificar = "UPDATE sedes SET nombre = '" + sede.getNombre() +"',"
                        + "direccion = '"+ sede.getDirecion() + "',"
                        + "telefono = '"+ sede.getTelefono()  +"'," 
                        + "id_empleado = '"+ sede.getDirector() + "'" 
                        + "WHERE identificacion = '"
                        + sede.getIdentificacion() + "';"; 
        
        System.out.println("Se construyó sentencia SQL");
        try{
        Connection conn= fachada.conectar();
        Statement sentencia = conn.createStatement();
        int numFilas = sentencia.executeUpdate(sql_modificar);
        conn.close();
        return numFilas;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return -1;
        //fin guardar
    }
    public void listarSedes(){}
    public void borrarSede(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
