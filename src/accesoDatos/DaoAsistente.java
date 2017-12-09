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
import logica.Asistente;

/**
 *
 * @author diegoruiz
 */
public class DaoAsistente {
    FachadaBD fachada;
    
    public DaoAsistente(){
        fachada = new FachadaBD();
    }
    public int guardarAsistente(Asistente a){
        int filasGuardadas = 0;
        String sql = "";
        sql = "INSERT INTO asistentes "+
              "(id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, direccion, telefono, email)"+
              " VALUES "+
              "('"+a.getIdentificacion()+"','"+a.getPrimerNombre()+"','"+a.getSegundoNombre()+"','"+a.getPrimerApellido()+"','"+a.getSegundoApellido()+"','"+a.getDireccion()+"','"+a.getTelefono()+"','"+a.getCorreo()+"')";
        try {
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql);            
            System.out.println("up " + filasGuardadas);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        return -1;
    }//Fin guardar asistente
    
    public boolean consultarAsistente(String id_asistente){
        String sql = "SELECT id FROM asistentes WHERE id='"+id_asistente+"'";
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
    }//Fin consultar Asistente
    
    public Asistente recuperarAsistente(String id_asistente){
        Asistente asistente = new Asistente();
        String sql = "SELECT * FROM asistentes WHERE id='"+id_asistente+"'";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                asistente.setIdentificacion(tabla.getString(1));
                asistente.setPrimerNombre(tabla.getString(2));
                asistente.setSegundoNombre(tabla.getString(3));
                asistente.setPrimerApellido(tabla.getString(4));
                asistente.setSegundoApellido(tabla.getString(5));
                asistente.setDireccion(tabla.getString(6));
                asistente.setTelefono(tabla.getString(7));
                asistente.setCorreo(tabla.getString(8));
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
            return asistente;
        } catch(SQLException e){ 
            System.out.println(e); 
        } catch(Exception e){ 
              System.out.println(e); 
        }
        return asistente;
    }//Fin de recuperar asistente
    
    public int modificarAsistente(Asistente a){
        String sql = "UPDATE asistentes SET primer_nombre='"+a.getPrimerNombre()+"', segundo_nombre='"+a.getSegundoNombre()+
                     "', primer_apellido='"+a.getPrimerApellido()+"', segundo_apellido='"+a.getSegundoApellido()+
                     "', direccion='"+a.getDireccion()+"', telefono='"+a.getTelefono()+"', email='"+a.getCorreo()+"' WHERE id='"+a.getIdentificacion()+"'";
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
    }//Fin de modificar asistente
    
    public Asistente[] listarAsistentes(String[] ids){
        Asistente[] asistentes;
        Asistente asistente;
        int num_asistentes = ids.length;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            asistentes = new Asistente[num_asistentes];
            for(int i=0; i<num_asistentes; i++){
                asistente = new Asistente();
                String sql = "SELECT * FROM asistentes WHERE id='"+ids[i].split(" - ")[0]+"'";
                ResultSet tabla = tabla = sentencia.executeQuery(sql);
                while(tabla.next()){
                    asistente.setIdentificacion(tabla.getString(1));
                    asistente.setPrimerNombre(tabla.getString(2));
                    asistente.setSegundoNombre(tabla.getString(3));
                    asistente.setPrimerApellido(tabla.getString(4));
                    asistente.setSegundoApellido(tabla.getString(5));
                    asistente.setDireccion(tabla.getString(6));
                    asistente.setTelefono(tabla.getString(7));
                    asistente.setCorreo(tabla.getString(8));
                }
                asistentes[i] = asistente;
            }
            return asistentes;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch(Exception ex){ 
            System.out.println(ex);
        }
        asistentes = null; //Asumiendo que no encontró nada
        return asistentes;
    }
    public void cerrarConexionBD(){
       fachada.closeConection(fachada.getConnetion());
    }  
}//Fin class DaoAsistente
