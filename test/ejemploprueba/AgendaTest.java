/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploprueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caldas
 */
public class AgendaTest {
    
    private static Persona persona1;
    private static Agenda agendaConUnaPersona;
    
    public AgendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        persona1 = new Persona(1L,"A",1);
        agendaConUnaPersona = new Agenda();
        agendaConUnaPersona.agregarContacto(persona1);
    }
    
    @After
    public void tearDown() {
        agendaConUnaPersona = new Agenda();
        agendaConUnaPersona.agregarContacto(persona1);
    }

    /**
     * Test of cantidadContactos method, of class Agenda.
     */
    @org.junit.Test
    public void testCantidadContactos1() {
        System.out.println("cantidadContactos1");
        Agenda instance = new Agenda();
        Integer expResult = 0;
        Integer result = instance.cantidadContactos();
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testCantidadContactos2() {
        System.out.println("cantidadContactos2");
        Agenda instance = new Agenda();
        instance.agregarContacto(persona1);
        Integer expResult = 1;
        Integer result = instance.cantidadContactos();
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testCantidadContactos3() {
        System.out.println("cantidadContactos3");
        agendaConUnaPersona.eliminarContacto(persona1);
        Integer expResult = 0;
        Integer result = agendaConUnaPersona.cantidadContactos();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarContacto method, of class Agenda.
     */
    @org.junit.Test
    public void testAgregarContacto() {
        System.out.println("agregarContacto");
        Persona personaNueva = null;
        Agenda instance = new Agenda();
        Boolean expResult = false;
        Boolean result = instance.agregarContacto(personaNueva);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testAgregarContacto2() {
        System.out.println("agregarContacto2");
        Persona personaNueva = new Persona(1L,"A",1);
        Agenda instance = new Agenda();
        Boolean expResult = true;
        Boolean result = instance.agregarContacto(personaNueva);
        assertEquals(expResult, result);
    }

    /**
     * Test of busqueNombre method, of class Agenda.
     */
    @org.junit.Test
    public void testBusqueNombre() {
        System.out.println("busqueNombre");
        Long identificacionBusco = 1L;
        String expResult = "A";
        String result = agendaConUnaPersona.busqueNombre(identificacionBusco);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testBusqueNombre2() {
        System.out.println("busqueNombre2");
        Long identificacionBusco = 2L;
        String expResult = "";
        String result = agendaConUnaPersona.busqueNombre(identificacionBusco);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarContacto method, of class Agenda.
     */
    @org.junit.Test
    public void testEliminarContacto() {
        System.out.println("eliminarContacto");
        Persona personaEliminar = persona1;
        Boolean expResult = true;
        Boolean result = agendaConUnaPersona.eliminarContacto(personaEliminar);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testEliminarContacto2() {
        System.out.println("eliminarContacto2");
        Persona personaEliminar = new Persona(2L,"A",1);
        Boolean expResult = false;
        Boolean result = agendaConUnaPersona.eliminarContacto(personaEliminar);
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testEliminarContacto3() {
        System.out.println("eliminarContacto3");
        Persona personaEliminar = null;
        Boolean expResult = false;
        Boolean result = agendaConUnaPersona.eliminarContacto(personaEliminar);
        assertEquals(expResult, result);
    }
}
