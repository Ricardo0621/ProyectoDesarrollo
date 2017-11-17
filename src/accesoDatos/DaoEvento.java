/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Evento;

/**
 *
 * @author diegoruiz
 */
public class DaoEvento {
    FachadaBD fachada;
    
    public DaoEvento(){
        fachada = new FachadaBD();
    }
    public int guardarEvento(Evento evento){
        int filasGuardadas = 0;
        return filasGuardadas;
    }
    public Evento consultarEvento(String identificacion){
        Evento evento = null;
        return evento;
    }
    public void modificarEvento(String identificacion){}
    /**
     * Listar nombres eventos
     */
    public Evento[] listarEventos(){
        Evento[] eventos;
        Evento evento;
        String sql_count = "SELECT COUNT(*) AS filas FROM eventos";
        String sql = "SELECT * FROM eventos";
        int filas = 0;
        int contador = 0;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            eventos = new Evento[filas];
            tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                evento = new Evento();
                evento.setIdentificacion(tabla.getString(1));
                evento.setIdEmpleado(tabla.getString(2));
                evento.setNombre(tabla.getString(3));
                evento.setDescipcion(tabla.getString(4));
                evento.setFechaCreacion(tabla.getString(5));
                evento.setFechaInicio(tabla.getString(6));
                evento.setFechaFin(tabla.getString(7));
                evento.setHorario(tabla.getString(8));
                evento.setHoras(Integer.parseInt(tabla.getString(9)));
                evento.setValor(Integer.parseInt(tabla.getString(10)));
                evento.setLugar(tabla.getString(11));
                evento.setCupos(Integer.parseInt(tabla.getString(12)));
                evento.setEstado(tabla.getString(13));
                eventos[contador] = evento;
                contador++;
            }
            /*tabla.close();
            sentencia.close();
            conn.close();*/
            return eventos;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        
        
        eventos = null; //Asumiendo que no hayan sedes
        return eventos;
    }
    
    /**
     * Listar las identificaciones de los asistentes a un evento en específico o a todos los eventos
     */
    public String[] listarIdsEvento(int evento_id){
        String sql_count = "";
        String sql = "";
        if(evento_id == 0){
            sql_count = "SELECT COUNT(*) AS filas FROM (SELECT DISTINCT asistente_id FROM eventos_asistentes) AS c1";
            sql = "SELECT DISTINCT asistente_id FROM eventos_asistentes";
        }else{
            sql_count = "SELECT COUNT(*) AS filas FROM (SELECT DISTINCT asistente_id FROM eventos_asistentes WHERE evento_id = "+evento_id+") AS c1";
            sql = "SELECT DISTINCT asistente_id FROM eventos_asistentes WHERE evento_id = "+evento_id;
        }
        
        int filas = 0;
        String[] ids;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            ids = new String[filas];
            for(int i=0; i<filas; i++){
                tabla = sentencia.executeQuery(sql);
                tabla.next();
                ids[i] = tabla.getString(1);
            }
            return ids;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        ids = null; //Asumiendo que no hayan sedes
        return ids;
    }//Fin listarIdsEvento
    
    public void borrarEvento(String identificacion){}
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }
    
}
