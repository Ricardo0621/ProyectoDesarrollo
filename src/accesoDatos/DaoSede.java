/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
import java.util.HashSet;
import logica.Sede;

/**
 *
 * @author Ricardo0621
 */
public class DaoSede {

    FachadaBD fachada;

    public DaoSede() {
        fachada = new FachadaBD();
    }

    public int guardarSede() {
        int filasGuardadas = 0;
        return filasGuardadas;
    }

    public Sede consultarAsistente() {
        Sede sede = null;
        return sede;
    }

    public int registarSede(Sede sede) {
        String sql_registrar;
        int filasGuardadas = 0;
        sql_registrar = "INSERT INTO sedes VALUES" + "(" + "'"
                + sede.getIdentificacion() + "'" + "," + "'"
                + sede.getIdEmpleado() + "'" + "," + "'"
                + sede.getNombre() + "'" + "," + "'"
                + sede.getDirecion() + "'" + "," + "'"
                + sede.getTelefono() + "'" + "," + "'"
                + sede.getFechaCreacion() + "'"
                + ")";
        System.out.println(sql_registrar);
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql_registrar);
            System.out.println("up " + filasGuardadas);
            System.out.println("Sede Creada");
            //fachada.closeConection(conn);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public boolean consultarSede(String id_sede) {
        String sql = "SELECT id FROM sedes WHERE id='" + id_sede + "'";
        boolean result = false;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            //fachada.closeConection(conn);
            if (tabla.next()) {
                result = true;
            } else {
                result = false;
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }//Fin consultar Empleado

    public Sede recuperarSede(String id_sede) {
        Sede sede = new Sede();
        String sql = "SELECT * FROM sedes WHERE id='" + id_sede + "'";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                sede.setIdentificacion(tabla.getString(1));
                sede.setIdEmpleado(tabla.getString(2));
                sede.setNombre(tabla.getString(3));
                sede.setDirecion(tabla.getString(4));
                sede.setTelefono(tabla.getString(5));
                sede.setFechaCreacion(tabla.getString(6));
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
            return sede;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return sede;
    }//Fin de recuperar sede

    public int modificarSedes(Sede sede) {
        String sql = "UPDATE sedes SET id_empleado='" + sede.getIdEmpleado() + "', nombre='" + sede.getNombre()
                + "', direccion='" + sede.getDirecion() + "', telefono='" + sede.getTelefono()
                + "', fecha_creacion='" + sede.getFechaCreacion() + "' WHERE id='" + sede.getIdentificacion() + "'";
        int filas_guardadas = -1;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            filas_guardadas = sentencia.executeUpdate(sql);
            System.out.println("up " + filas_guardadas);
            //sentencia.close();
            //conn.close();
            return filas_guardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }//Fin de modificar asistente

    /**
     * Listar nombres sedes
     */
    public Sede[] listarSedes() {
        Sede[] sedes;
        Sede sede;
        String sql_count = "SELECT COUNT(*) AS filas FROM sedes";
        String sql = "SELECT * FROM sedes";
        int filas = 0;
        int contador = 0;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            sedes = new Sede[filas];
            tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                sede = new Sede();
                sede.setIdentificacion(tabla.getString(1));
                sede.setIdEmpleado(tabla.getString(2));
                sede.setNombre(tabla.getString(3));
                sede.setDirecion(tabla.getString(4));
                sede.setTelefono(tabla.getString(5));
                sede.setFechaCreacion(tabla.getString(6));
                sedes[contador] = sede;
                contador++;
            }
            /*tabla.close();
            sentencia.close();
            conn.close();*/
            return sedes;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        sedes = null; //Asumiendo que no hayan sedes
        return sedes;
    }

    public void borrarSede(String identificacion) {
    }

    public void cerrarConexionBD() {
        fachada.closeConection(fachada.getConnetion());
    }

}
