/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoexamen;

/**
 *
 * @author dayan
 */
public class Empleado {
    private String nombre;
    private String fecha;
 
    public Empleado(String nombre, String fecha) {
	this.nombre = nombre;
	this.fecha = fecha;
    }
 
    public String getNombre() {
	return nombre;
    }
	
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
	
    public String getFecha() {
	return fecha;
    }
	
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
