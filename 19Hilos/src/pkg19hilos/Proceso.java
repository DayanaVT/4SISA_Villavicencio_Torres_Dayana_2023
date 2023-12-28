/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg19hilos;

/**
 *
 * @author dayan
 */
public class Proceso extends Thread {
    
    /*
    Los hilos nos permiten crear procesos independientes que se
    pueden ejecutar como elementos de objetos
    
    Cada hilo puede tener su propia serie de operaciones 
    Cada hilo puede mandar a llamar a mas hilos
    */
    
    public Proceso(){
    
    }
    
    public Proceso(String nombreHilo){
        super(nombreHilo);
    }
    
    //correr el hilo
    int num_int;
    
    public void run(){
        for(int i = 0; i <= num_int; i++){
            System.out.println(" + " + this.getName());
        }
        System.out.println("");
    }
    
    public void valorDecondicion(int valor){
        this.num_int = valor;
    }
    
}
