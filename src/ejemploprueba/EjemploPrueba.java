/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploprueba;

/**
 *
 * @author caldas
 */
public class EjemploPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona(1L,"A",1);
        Persona persona2 = new Persona(2L,"B",2);
        Agenda miAgenda = new Agenda();
        miAgenda.agregarContacto(persona1);
        miAgenda.agregarContacto(persona2);
        miAgenda.eliminarContacto(persona1);
    }
    
}
