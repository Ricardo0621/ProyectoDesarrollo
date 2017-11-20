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
    
    public ControladorEvento(){
        daoEvento = new DaoEvento();
    }
    
    public int  insertarEvento(String  identificacion, String nombre, String descripcion, String lugar, String fecha_creacion, String fecha_inicio, String fecha_fin, int valor){
        int result = 0;
        return result;
    }//end

    public Evento consultarEvento(String identificacion){
        Evento evento = new Evento();
        return evento;
    }
    
    public String[] listarIdsAsistentesEvento(String id_evento){
        String[] ids = {"id_asistente1","id_asistente2"};
        return ids;
    }
    
    public String[] listarIdNombreEventos(){
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventos("", "", "", "");
        nombres_ids_eventos = new String[eventos.length];
        for(int i=0; i<eventos.length; i++){
            nombres_ids_eventos[i] = eventos[i].getIdentificacion()+" - "+eventos[i].getNombre();
        }
        return nombres_ids_eventos;
    }
    
    public String[] listarEventosPorCampo(String campo, String contenido, String fecha1, String fecha2){
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventos(campo, contenido, fecha1, fecha2);
        nombres_ids_eventos = new String[eventos.length];
        for(int i=0; i<eventos.length; i++){
            if(campo.equals("estado")){
                nombres_ids_eventos[i] = eventos[i].getIdentificacion()+" - "+eventos[i].getNombre()+" - "+eventos[i].getEstado()+" - "+eventos[i].getFechaInicio();
            }else if(campo.equals("cupos")){
                nombres_ids_eventos[i] = eventos[i].getIdentificacion()+" - "+eventos[i].getNombre()+" - "+eventos[i].getCupos()+" - "+eventos[i].getFechaInicio();
            }
        }
        return nombres_ids_eventos;
    }
    
    public String[] listarIdNombreEventosAsistente(String asistente_id){
        String[] nombres_ids_eventos;
        Evento[] eventos = daoEvento.listarEventosAsistente(asistente_id);
        nombres_ids_eventos = new String[eventos.length];
        for(int i=0; i<eventos.length; i++){
            nombres_ids_eventos[i] = eventos[i].getIdentificacion()+" - "+eventos[i].getNombre()+" - "+eventos[i].getValor();
        }
        return nombres_ids_eventos;
    }
    
    public String[] listarIdsEvento(int evento_id){
        return daoEvento.listarIdsEvento(evento_id);
    }
    
    public int inscribirAsistenteEvento(String empleado_id,int evento_id, String asistente_id){
        return daoEvento.inscribirAsistenteEvento(empleado_id, evento_id, asistente_id);
    }
    
    public int registrarPagoEvento(int evento_id, String asistente_id, String metodo_pago, String empleado_id_pago){
        return daoEvento.registrarPagoEvento(evento_id, asistente_id, metodo_pago, empleado_id_pago);
    }
    
    public String[] estadosPagoEventos(String asistente_id){
        return daoEvento.estadosPagoEventos(asistente_id);
    }

    public void listarEventos(){}
    
    public void cerrarConexionBD(){
        daoEvento.cerrarConexionBD();
    }
}
