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
public class Persona {
    private Long identificacion;
    private String nombre;
    private Integer edad;

    public Persona(Long identificacion, String nombre, Integer edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
    
}
