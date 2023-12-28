/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19hilos;

/**
 *
 * @author dayan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo de un Hilo");
        
        Proceso hilo1 = new Proceso("Hilo1");
        Proceso hilo2 = new Proceso("Hilo2");
        Proceso hilo3 = new Proceso("Hilo3");
        
        hilo1.valorDecondicion(5);
        hilo2.valorDecondicion(6);
        hilo3.valorDecondicion(7);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
    
}
