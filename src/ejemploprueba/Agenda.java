/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploprueba;

import java.util.ArrayList;

/**
 *
 * @author caldas
 */
public class Agenda {
    
    private ArrayList<Persona> listadeContactos;

    public Agenda() {
        listadeContactos = new ArrayList<>();
    }
    
    public Integer cantidadContactos(){
        return listadeContactos.size();
    }
    
    public Boolean agregarContacto(Persona personaNueva){
        Integer cantidadActual = cantidadContactos();
        listadeContactos.add(personaNueva);
        if (cantidadActual == cantidadContactos()-1){
            return true;
        }
        return false;
    }
    
    public String busqueNombre(Long identificacionBusco){
        Persona personaTemporal;
        for(int i =0; i<cantidadContactos();i++){
            personaTemporal = listadeContactos.get(i);
            if(identificacionBusco.equals(personaTemporal.getIdentificacion())){
                return personaTemporal.getNombre();
            }
        }
        return "";
    }
    
    public Boolean eliminarContacto(Persona personaEliminar){
        Persona personaTemporal;
        for(int i =0; i<cantidadContactos();i++){
            personaTemporal = listadeContactos.get(i);
            if(personaEliminar.getIdentificacion().equals(personaTemporal.getIdentificacion())){
                listadeContactos.remove(i);
                return true;
            }
        }
        return false;
    }
}
