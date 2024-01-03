/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero_examen;

/**
 *
 * @author dayan
 */
public class Cajero {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Dayana", "210104", 1000);
        Cliente cliente2 = new Cliente("Ian", "67890", 2000);
        
        Thread hilo1 = new Thread(new Transaccion(cliente1, "retiro", 150));
        Thread hilo2 = new Thread(new Transaccion(cliente2, "deposito", 100));
        
        hilo1.start();
        hilo2.start();
    }
    
}
