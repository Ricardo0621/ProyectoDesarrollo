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
import java.sql.Timestamp;
import logica.Evento;

/**
 *
 * @author diegoruiz
 */
public class DaoEvento {

    FachadaBD fachada;

    public DaoEvento() {
        fachada = new FachadaBD();
    }

    public int guardarEvento(Evento evento) {
        int filasGuardadas = 0;
        return filasGuardadas;
    }

    public boolean consultarEvento(String identificacion) {
        String sql = "SELECT id FROM eventos WHERE id='" + identificacion + "'";
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
    }

    public int modificarEvento(Evento evento) {
        String sql = "UPDATE eventos SET id_empleado='" + evento.getIdEmpleado() + "', nombre='" + evento.getNombre()
                + "', descripcion='" + evento.getDescripcion() + "', fecha_creacion='" + evento.getFechaCreacion()
                + "', fecha_inicio='" + evento.getFechaInicio() + "', fecha_fin='" + evento.getFechaFin()
                + "', horario='" + evento.getHorario() + "', horas='" + evento.getHoras()
                + "', valor='" + evento.getValor() + "', lugar='" + evento.getLugar()
                + "', cupos='" + evento.getCupos() + "', estado='" + evento.getEstado()
                + "' WHERE id='" + evento.getIdentificacion() + "'";
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
    }

    public Evento[] listarEventos(String campo, String contenido, String fecha1, String fecha2) {
        Evento[] eventos;
        Evento evento;
        String sql_count = "";
        String sql = "";
        if (campo.equals("estado")) {
            sql_count = "SELECT COUNT(*) AS filas FROM eventos WHERE estado='" + contenido + "' AND fecha_inicio BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
            sql = "SELECT * FROM eventos WHERE estado='" + contenido + "' AND fecha_inicio BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
        } else if (campo.equals("cupos")) {
            sql_count = "SELECT COUNT(*) AS filas FROM eventos WHERE estado='Activo' AND fecha_inicio BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
            sql = "SELECT * FROM eventos WHERE estado='Activo' AND fecha_inicio BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
        } else if (campo.equals("")) {
            sql_count = "SELECT COUNT(*) AS filas FROM eventos";
            sql = "SELECT * FROM eventos";
        }
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
            while (tabla.next()) {
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
        } catch (Exception ex) {
            System.out.println(ex);
        }

        eventos = null; //Asumiendo que no hayan sedes
        return eventos;
    }//Fin listarEventos()

    public Evento[] listarEventosAsistente(String asistente_id) {
        Evento[] eventos;
        Evento evento;
        String sql_count = "SELECT COUNT(*) AS filas FROM pagos WHERE id_asistente='" + asistente_id + "' AND estado='Pendiente'";
        String sql = "SELECT id_evento FROM pagos WHERE id_asistente='" + asistente_id + "' AND estado='Pendiente'";
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
            while (tabla.next()) {
                sql = "SELECT * FROM eventos WHERE id=" + tabla.getInt(1);
                try {
                    Statement sentencia1 = conn.createStatement();
                    ResultSet tabla1 = sentencia1.executeQuery(sql);
                    while (tabla1.next()) {
                        evento = new Evento();
                        evento.setIdentificacion(tabla1.getString(1));
                        evento.setIdEmpleado(tabla1.getString(2));
                        evento.setNombre(tabla1.getString(3));
                        evento.setDescipcion(tabla1.getString(4));
                        evento.setFechaCreacion(tabla1.getString(5));
                        evento.setFechaInicio(tabla1.getString(6));
                        evento.setFechaFin(tabla1.getString(7));
                        evento.setHorario(tabla1.getString(8));
                        evento.setHoras(Integer.parseInt(tabla1.getString(9)));
                        evento.setValor(Integer.parseInt(tabla1.getString(10)));
                        evento.setLugar(tabla1.getString(11));
                        evento.setCupos(Integer.parseInt(tabla1.getString(12)));
                        evento.setEstado(tabla1.getString(13));
                        eventos[contador] = evento;
                        contador++;
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            return eventos;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    /**
     * Método para retornar arreglo de eventos a partir de un arreglo de
     * eventos_id
     */
    public Evento[] listarEventosPorIds(int[] ids_eventos) {
        Evento[] eventos = new Evento[ids_eventos.length];
        Evento evento;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            for (int i = 0; i < ids_eventos.length; i++) {
                String sql = "SELECT * FROM eventos WHERE id=" + ids_eventos[i];
                ResultSet tabla = sentencia.executeQuery(sql);
                while (tabla.next()) {
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
                    eventos[i] = evento;
                }
            }
            return eventos;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null; //Asumiendo que no hayan sedes
    }//Fin listarEventosPorIds()

    /**
     * Método para manejar los datos en la relación pagos, retorna arreglo de
     * cadenas Listar las identificaciones de los asistentes a un evento en
     * específico o a todos los eventos
     */
    public String[] listarIdsEvento(int evento_id) {
        String sql_count = "";
        String sql = "";
        sql_count = "SELECT COUNT(*) AS filas FROM (SELECT DISTINCT id_asistente FROM pagos WHERE id_evento = " + evento_id + ") AS c1";
        sql = "SELECT DISTINCT id_asistente FROM pagos WHERE id_evento = " + evento_id;
        int filas = 0;
        int contador = 0;
        String[] ids;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            ids = new String[filas];
            tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                ids[contador] = tabla.getString(1);
                contador++;
            }
            return ids;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        ids = null; //Asumiendo que no hayan sedes
        return ids;
    }//Fin listarIdsEvento

    public String[] estadosPagoEventos(String asistente_id) {
        String sql_count = "SELECT COUNT(*) AS filas FROM (SELECT id_evento FROM pagos WHERE id_asistente='" + asistente_id + "') AS c1";
        String sql = "SELECT p1.id_asistente, e1.id, e1.nombre, p1.estado "
                + "FROM pagos p1, eventos e1 "
                + "WHERE p1.id_asistente='" + asistente_id + "' AND p1.id_evento=e1.id";
        int filas = 0;
        int contador = 0;
        String[] estados_pagos_eventos;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            filas = tabla.getInt("filas");
            estados_pagos_eventos = new String[filas];
            tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                estados_pagos_eventos[contador] = tabla.getString(1) + " - " + tabla.getString(2) + " - " + tabla.getString(3) + " - " + tabla.getString(4);
                contador++;
            }
            return estados_pagos_eventos;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null; //Asumiendo que no hayan sedes
    }

    public int inscribirAsistenteEvento(String empleado_id, int evento_id, String asistente_id, String sede_id) {
        int filasGuardadas = 0;
        String metodo_pago = "None";
        String estado = "Pendiente";
        String id_empleado_pago = null;
        String fecha_pago = null;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String sql = "INSERT INTO pagos "
                + "(id_empleado, id_evento, id_asistente, metodo_pago,fecha, estado, id_empleado_pago, fecha_pago, sede_id)"
                + " VALUES "
                + "('" + empleado_id + "'," + evento_id + ",'" + asistente_id + "','" + metodo_pago + "','" + timestamp + "','" + estado + "'," + id_empleado_pago + "," + fecha_pago + "," + sede_id + ")";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql);
            System.out.println("up " + filasGuardadas);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }

    public int registrarPagoEvento(int evento_id, String asistente_id, String metodo_pago, String empleado_id_pago) {
        int filasGuardadas = 0;
        String estado = "Pagado";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String sql = "UPDATE pagos "
                + "SET metodo_pago='" + metodo_pago + "', estado='" + estado + "', id_empleado_pago='" + empleado_id_pago + "', fecha_pago='" + timestamp + "'" 
                + "WHERE id_evento=" + evento_id + " AND id_asistente='" + asistente_id + "'";

        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql);
            System.out.println("up " + filasGuardadas);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }

    public int getCuposEvento(int evento_id) {
        String sql = "SELECT cupos AS cupos "
                + "FROM eventos "
                + "WHERE id=" + evento_id;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            tabla.next();
            int filas_guardadas = tabla.getInt("cupos");
            return filas_guardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }

    public int descontarCupoEvento(int evento_id) {
        String sql = "UPDATE eventos "
                + "SET cupos = cupos - 1 "
                + "WHERE id=" + evento_id;
        int filasGuardadas = 0;
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }
    
    public void cerrarConexionBD() {
        fachada.closeConection(fachada.getConnetion());
    }

    public int registrarEvento(Evento evento) {
        String sql_registrar;
        int filasGuardadas = 0;
        sql_registrar = "INSERT INTO eventos VALUES" + "(" + "'"
                + evento.getIdentificacion() + "'" + "," + "'"
                + evento.getIdEmpleado() + "'" + "," + "'"
                + evento.getNombre() + "'" + "," + "'"
                + evento.getDescripcion() + "'" + "," + "'"
                + evento.getFechaCreacion() + "'" + "," + "'"
                + evento.getFechaInicio() + "'" + "," + "'"
                + evento.getFechaFin() + "'" + "," + "'"
                + evento.getHorario() + "'" + "," + "'"
                + evento.getHoras() + "'" + "," + "'"
                + evento.getValor() + "'" + "," + "'"
                + evento.getLugar() + "'" + "," + "'"
                + evento.getCupos() + "'" + "," + "'"
                + evento.getEstado() + "'"
                + ")";
        System.out.println(sql_registrar);
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            filasGuardadas = sentencia.executeUpdate(sql_registrar);
            System.out.println("up " + filasGuardadas);
            System.out.println("Evento Creado");
            //fachada.closeConection(conn);
            return filasGuardadas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public Evento recuperarEvento(String identificacion) {
        Evento evento = new Evento();
        String sql = "SELECT * FROM eventos WHERE id='" + identificacion + "'";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                evento.setIdentificacion(tabla.getString(1));
                evento.setIdEmpleado(tabla.getString(2));
                evento.setNombre(tabla.getString(3));
                evento.setDescipcion(tabla.getString(4));
                evento.setFechaCreacion(tabla.getString(5));
                evento.setFechaInicio(tabla.getString(6));
                evento.setFechaFin(tabla.getString(7));
                evento.setHorario(tabla.getString(8));
                evento.setHoras(tabla.getInt(9));
                evento.setValor(tabla.getInt(10));
                evento.setLugar(tabla.getString(11));
                evento.setCupos(tabla.getInt(12));
                evento.setEstado(tabla.getString(13));
            }
            //tabla.close();
            //sentencia.close();
            //conn.close();
            return evento;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return evento;
    }
    
    public String[] ventasPorSede(){
        String[] ventas_sede;
        int contador=0;
        String sql_count = "SELECT COUNT(*) AS filas "+
                           "FROM (SELECT s1.nombre, SUM(e1.valor) "+
                                 "FROM sedes s1, pagos p1, eventos e1 "+
                                 "WHERE s1.id = p1.sede_id AND e1.id=p1.id_evento AND p1.estado='Pagado'"+
                                 "GROUP BY s1.id) AS x";    
        String sql = "SELECT s1.nombre, SUM(e1.valor) "+
                     "FROM sedes s1, pagos p1, eventos e1 "+
                     "WHERE s1.id = p1.sede_id AND e1.id=p1.id_evento AND p1.estado='Pagado'"+
                     "GROUP BY s1.id";
        try {
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_count);
            tabla.next();
            int filas = tabla.getInt("filas");
            ventas_sede = new String[filas];
            tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                ventas_sede[contador] = tabla.getString(1)+" - "+tabla.getString(2);
                contador++;
            }
            return ventas_sede;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

}
