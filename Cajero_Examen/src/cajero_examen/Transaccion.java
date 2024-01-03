/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero_examen;

/**
 *
 * @author dayan
 */
public class Transaccion implements Runnable {
    private Cliente cliente;
    private String tipo;
    private double cantidad;

    public Transaccion(Cliente cliente, String tipo, double cantidad) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    @Override
    public void run() {
        if (tipo.equals("retiro")) {
            cliente.retirar(cantidad);
        } else if (tipo.equals("deposito")){
            cliente.depositar(cantidad);
        }
    }
    
    
}
