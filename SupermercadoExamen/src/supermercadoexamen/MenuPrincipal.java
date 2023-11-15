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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {
    JButton inventarioButton;
    JButton empleadosButton;

    public MenuPrincipal() {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        inventarioButton = new JButton("Gestión de Inventario");
        empleadosButton = new JButton("Gestión de Empleados");

        inventarioButton.addActionListener(this);
        empleadosButton.addActionListener(this);

        panel.add(inventarioButton);
        panel.add(empleadosButton);

        add(panel);
    }

    public static void main(String[] args) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inventarioButton) {
            Inventario inventario = new Inventario();
            inventario.setVisible(true);
            inventario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            JButton volverButton = new JButton("Volver");
            volverButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    inventario.dispose(); // Cierra la ventana de inventario
                }
            });

            inventario.add(volverButton);
            
        } else if (e.getSource() == empleadosButton) {
            GestionEmpleados gestionEmpleados = new GestionEmpleados();
            gestionEmpleados.setVisible(true);
            gestionEmpleados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Para cerrar solo esta ventana

            JButton volverButton = new JButton("Volver");
            volverButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    gestionEmpleados.dispose(); // Cierra la ventana de gestión de empleados
                }
            });

            gestionEmpleados.add(volverButton);
        }
    }
}

 

