/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoexamen;

/**
 *
 * @author dayan
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Inventario extends JFrame implements ActionListener {
    
    private Container contenedor;
    JLabel labeltitulo;
    JTextArea areatexto;
    JScrollPane scrollpane;
    String texto;
    JButton botonmostrar;
    JButton botonagregar;
    private ArrayList<Producto> listaProductos;


    public Inventario() {
        
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        listaProductos = new ArrayList<>();

        labeltitulo = new JLabel();
        labeltitulo.setText("Inventario Super");
        labeltitulo.setBounds(110,290, 180, 25);

        areatexto = new JTextArea();
        areatexto.setLineWrap(true);
        areatexto.setWrapStyleWord(true);
        
        scrollpane =  new JScrollPane();
        scrollpane.setBounds(20, 50, 350, 270);
        scrollpane.setViewportView(areatexto);

        botonmostrar = new JButton();
        botonmostrar.setText("Mostrar Inventario");
        botonmostrar.setBounds(100, 330, 80, 25);
        botonmostrar.addActionListener(this);
        
        botonagregar = new JButton();
        botonagregar.setText("Agregar Productos");
        botonagregar.setBounds(220, 330, 80, 25);
        botonagregar.addActionListener(this);
        
        contenedor.add(labeltitulo);
        contenedor.add(scrollpane);
        contenedor.add(botonmostrar);
        contenedor.add(botonagregar);
        
        setTitle("Ventana de Inventario");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarInventario() {
        StringBuilder inventarioStr = new StringBuilder("Inventario:\n");
        for (Producto producto : listaProductos) {
            inventarioStr.append(producto).append("\n");
        }
        areatexto.setText(inventarioStr.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonagregar){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

            Producto nuevoProducto = new Producto(nombre, cantidad, precio);
            agregarProducto(nuevoProducto);

            JOptionPane.showMessageDialog(null, "Producto agregado al inventario.", "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getActionCommand().equals("Mostrar Inventario")) {
            mostrarInventario();
        }
    }

    
}








