/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import accesoDatos.DaoEvento;
import java.util.Arrays;
import logica.Evento;

/**
 *
 * @author diegoruiz
 */
public class ControladorEvento {

    DaoEvento daoEvento;

    public ControladorEvento() {
        daoEvento = new DaoEvento();
    }

    public int insertarEvento(String identificacion, String nombre, String descripcion, String lugar, String fecha_creacion, String fecha_inicio, String fecha_fin, int valor) {
        int result = 0;
        return result;
    }//end

    public boolean consultarEvento(String identificacion) {
        return daoEvento.consultarEvento(identificacion);
    }

    public String[] listarIdsAsistentesEvento(String id_evento) {
        String[] ids = {"id_asistente1", "id_asistente2"};
        return ids;
    }

    public String[] listarIdNombreEventos() {
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventos("", "", "", "");
        nombres_ids_eventos = new String[eventos.length];
        for (int i = 0; i < eventos.length; i++) {
            nombres_ids_eventos[i] = eventos[i].getIdentificacion() + ";;;"
                    + eventos[i].getIdEmpleado() + ";;;"
                    + eventos[i].getNombre() + ";;;"
                    + eventos[i].getDescripcion() + ";;;"
                    + eventos[i].getFechaCreacion() + ";;;"
                    + eventos[i].getFechaInicio();
        }
        return nombres_ids_eventos;
    }

    public String[] listarEventosPorCampo(String campo, String contenido, String fecha1, String fecha2) {
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventos(campo, contenido, fecha1, fecha2);
        nombres_ids_eventos = new String[eventos.length];
        for (int i = 0; i < eventos.length; i++) {
            if (campo.equals("estado")) {
                nombres_ids_eventos[i] = eventos[i].getIdentificacion() + " - " + eventos[i].getNombre() + " - " + eventos[i].getEstado() + " - " + eventos[i].getFechaInicio();
            } else if (campo.equals("cupos")) {
                nombres_ids_eventos[i] = eventos[i].getIdentificacion() + " - " + eventos[i].getNombre() + " - " + eventos[i].getCupos() + " - " + eventos[i].getFechaInicio();
            }
        }
        return nombres_ids_eventos;
    }

    public String[] listarIdNombreEventosAsistente(String asistente_id) {
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventosAsistente(asistente_id);
        nombres_ids_eventos = new String[eventos.length];
        for (int i = 0; i < eventos.length; i++) {
            nombres_ids_eventos[i] = eventos[i].getIdentificacion() + " - " + eventos[i].getNombre() + " - " + eventos[i].getValor();
        }
        return nombres_ids_eventos;
    }

    public String[] listarIdsEvento(int evento_id) {
        return daoEvento.listarIdsEvento(evento_id);
    }

    public int inscribirAsistenteEvento(String empleado_id, int evento_id, String asistente_id) {
        return daoEvento.inscribirAsistenteEvento(empleado_id, evento_id, asistente_id);
    }

    public int registrarPagoEvento(int evento_id, String asistente_id, String metodo_pago, String empleado_id_pago) {
        return daoEvento.registrarPagoEvento(evento_id, asistente_id, metodo_pago, empleado_id_pago);
    }

    public String[] estadosPagoEventos(String asistente_id) {
        return daoEvento.estadosPagoEventos(asistente_id);
    }

    public int descontarCupoEvento(int evento_id) {
        return daoEvento.descontarCupoEvento(evento_id);
    }

    public int getCuposEvento(int evento_id) {
        return daoEvento.getCuposEvento(evento_id);
    }

    public void listarEventos() {
    }

    public void cerrarConexionBD() {
        daoEvento.cerrarConexionBD();
    }

    public int registrarEvento(String id_empleado, String identificacion, String nombre, String descripcion, String fecha_creacion, String fecha_inicio, String fecha_fin, String horario, String horas, String valor, String lugar, String cupos, String estado) {
        Evento evento;
        evento = new Evento();
        evento.setCupos(Integer.parseInt(cupos));
        evento.setDescipcion(descripcion);
        evento.setEstado(estado);
        evento.setFechaCreacion(fecha_creacion);
        evento.setFechaFin(fecha_fin);
        evento.setFechaInicio(fecha_inicio);
        evento.setHorario(horario);
        evento.setHoras(Integer.parseInt(horas));
        evento.setIdEmpleado(id_empleado);
        evento.setIdentificacion(identificacion);
        evento.setLugar(lugar);
        evento.setNombre(nombre);
        evento.setValor(Integer.parseInt(valor));
        return daoEvento.registrarEvento(evento);
    }

    public int editarEvento(String id_empleado, String identificacion, String nombre, String descripcion, String fecha_creacion, String fecha_inicio, String fecha_fin, String horario, String horas, String valor, String lugar, String cupos, String estado) {
        Evento evento;
        evento = new Evento();
        evento.setCupos(Integer.parseInt(cupos));
        evento.setDescipcion(descripcion);
        evento.setEstado(estado);
        evento.setFechaCreacion(fecha_creacion);
        evento.setFechaFin(fecha_fin);
        evento.setFechaInicio(fecha_inicio);
        evento.setHorario(horario);
        evento.setHoras(Integer.parseInt(horas));
        evento.setIdEmpleado(id_empleado);
        evento.setIdentificacion(identificacion);
        evento.setLugar(lugar);
        evento.setNombre(nombre);
        evento.setValor(Integer.parseInt(valor));
        return daoEvento.modificarEvento(evento);
    }

    public String[] extraerEvento(String identificacion) {
        String[] datos_evento = new String[13];
        Evento evento = new Evento();
        evento = daoEvento.recuperarEvento(identificacion);
        datos_evento[0] = evento.getIdentificacion();
        datos_evento[1] = evento.getIdEmpleado();
        datos_evento[2] = evento.getNombre();
        datos_evento[3] = evento.getDescripcion();
        datos_evento[4] = evento.getFechaCreacion();
        datos_evento[5] = evento.getFechaInicio();
        datos_evento[6] = evento.getFechaFin();
        datos_evento[7] = evento.getHorario();
        datos_evento[8] = String.valueOf(evento.getHoras());
        datos_evento[9] = String.valueOf(evento.getValor());
        datos_evento[10] = evento.getLugar();
        datos_evento[11] = String.valueOf(evento.getCupos());
        datos_evento[12] = evento.getEstado();
        return datos_evento;
    }
}
