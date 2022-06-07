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
    
    public AgendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cantidadContactos method, of class Agenda.
     */
    @org.junit.Test
    public void testCantidadContactos() {
        System.out.println("cantidadContactos");
        Agenda instance = new Agenda();
        Integer expResult = null;
        Integer result = instance.cantidadContactos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarContacto method, of class Agenda.
     */
    @org.junit.Test
    public void testAgregarContacto() {
        System.out.println("agregarContacto");
        Persona personaNueva = null;
        Agenda instance = new Agenda();
        Boolean expResult = null;
        Boolean result = instance.agregarContacto(personaNueva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busqueNombre method, of class Agenda.
     */
    @org.junit.Test
    public void testBusqueNombre() {
        System.out.println("busqueNombre");
        Long identificacionBusco = null;
        Agenda instance = new Agenda();
        String expResult = "";
        String result = instance.busqueNombre(identificacionBusco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarContacto method, of class Agenda.
     */
    @org.junit.Test
    public void testEliminarContacto() {
        System.out.println("eliminarContacto");
        Persona personaEliminar = null;
        Agenda instance = new Agenda();
        Boolean expResult = null;
        Boolean result = instance.eliminarContacto(personaEliminar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
