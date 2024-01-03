/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero_examen;

/**
 *
 * @author dayan
 */
public class Cliente {
    private String nombre;
    private int id;
    private int[] carrocompras;
    private double saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, String string, int id){
        super();
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int  getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public synchronized void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado por " + nombre);
            
        }else {
            System.out.println("No tiene dinero suficiente para retirar");
        }
    }
    
    public synchronized void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito de $" + cantidad);
        
        }else {
            System.out.println("Cantidad inválida para " + nombre);
        }
    }   
}
