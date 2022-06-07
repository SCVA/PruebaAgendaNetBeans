# PruebaAgendaNetBeans

<table class="tableizer-table">
<thead><tr class="tableizer-firstrow"><th>CantidadContactos()</th></tr></thead><tbody>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>listadeContactos</td><td>[]</td></tr>
 <tr><td>cantidadContactos()</td><td>0</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>listadeContactos</td><td>[]</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>cantidadContactos()</td><td>1</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>listadeContactos</td><td>[persona]</td></tr>
 <tr><td>eliminarContacto(persona)</td><td>true</td></tr>
 <tr><td>cantidadContactos()</td><td>0</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>agregarContacto </td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>null</td></tr>
 <tr><td>agregarContacto(persona)</td><td>false</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>busqueNombre</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>busqueNombre(1L)</td><td>"A"</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>busqueNombre(2L)</td><td>""</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td> </td></tr>
 <tr><td>eliminarContacto</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>personaEliminar</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>eliminarContacto(Persona personaEliminar)</td><td>true</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>personaEliminar</td><td>Persona(2L,"A",1)</td></tr>
 <tr><td>eliminarContacto(Persona personaEliminar)</td><td>false</td></tr>
 <tr><td>&nbsp;</td></tr>
 <tr><td>Caso de prueba</td><td>Valor esperado</td></tr>
 <tr><td>persona</td><td>Persona(1L,"A",1)</td></tr>
 <tr><td>agregarContacto(persona)</td><td>true</td></tr>
 <tr><td>personaEliminar</td><td>null</td></tr>
 <tr><td>eliminarContacto(Persona personaEliminar)</td><td>false</td></tr>
 <tr><td></td></tr>
</tbody></table>
