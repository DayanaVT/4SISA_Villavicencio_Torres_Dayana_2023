/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attack.on.titan;

/**
 *
 * @author dayan
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AttackOnTitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        menuCool menu = new menuCool();
        menu.setVisible(true);
    }
    
}

class menuCool extends JFrame {
    public menuCool(){
        setTitle("Menú Principal ");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JButton fundadorButton = new JButton("Titan Fundador");
        JButton ataqueButton = new JButton("Titan de Ataque");
        JButton colosalButton = new JButton("Titan Colosal");
        JButton acorazadoButton = new JButton("Titan Acorazado");
        JButton hembraButton = new JButton("Titan Hembra");
        JButton bestiaButton = new JButton("Titan Bestia");
        JButton mandibulaButton = new JButton("Titan Mandibula");
        JButton cargueroButton = new JButton("Titan Carguero");
        JButton martilloButton = new JButton("Titan Martillo de Guerra");
        
        
        fundadorButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame fundadorInfo = new infoTitanFrame("Titan Fundador \n ",
                                                                 "Titan más poderoso de todos ya que puede crear titanes puros y controlar todas sus acciones");
             fundadorInfo.setVisible(true);
             dispose();
         }
        });
        
        ataqueButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame ataqueInfo = new infoTitanFrame("Titan Ataque \n ",
                                                                 "Este titan resistió la Gran Guerra de los Titanes, y siempre ha luchado por la libertad de Eldia");
             ataqueInfo.setVisible(true);
             dispose();
         }
        }); 
        
        colosalButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame colosalInfo = new infoTitanFrame("Titan Colosal \n ",
                                                                 "Se reconoce muy fácilmente por su aspecto, es el más grande y fuerte, aunque también es lento");
             colosalInfo.setVisible(true);
             dispose();
         }
        });
        
        acorazadoButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame acorazadoInfo = new infoTitanFrame("Titan Acorazado \n ",
                                                                 "Destaca por la dureza de su piel, extremadamente gruesa.\n Destaca por su velocidad mejorada");
             acorazadoInfo.setVisible(true);
             dispose();
         }
        });
        
        hembraButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame hembraInfo = new infoTitanFrame("Titan Hembra \n ",
                                                                 "Titan Hembra demostró que puede atraer a los demás titanes por medio de un grito. \n Puede endurece cualquier parte de su cuerpo");
             hembraInfo.setVisible(true);
             dispose();
         }
        });
        
        bestiaButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame bestiaInfo = new infoTitanFrame("Titan Bestia \n ",
                                                                 "El portador de este poder tiene una gran fuerza física y capaz de convertir a los seres humanos en titanes. \n Tiene aspecto animal peludo como si fuera un gorila gigante y la capacidad de hablar el lenguaje humano con fluidez");
             bestiaInfo.setVisible(true);
             dispose();
         }
        });
        
        mandibulaButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame mandibulaInfo = new infoTitanFrame("Titan Mandibula \n ",
                                                                 "El aspecto de esta criatura es bastante desproporcionado, pero sus fortalezas son una poderosa mandibula y las garras.");
             mandibulaInfo.setVisible(true);
             dispose();
         }
        });
        
        cargueroButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame cargueroInfo = new infoTitanFrame("Titan Carguero \n ",
                                                                 "Tiene la habilidad de transformarse en un titan cudrupedo resistente para transportar cargas muy pesadas. \n Esto podría suponer un handicap para su velocidad, pero sigue siendo sorprendentemente ágil.");
             cargueroInfo.setVisible(true);
             dispose();
         }
        });
        
        martilloButton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             infoTitanFrame martilloInfo = new infoTitanFrame("Titan Martillo de Guerra \n ",
                                                                 "Si hablamos de este titán, es necesario hablar de la familia Tybur.\n Es un clan bastante influyente que tiene el poder del Titán Martillo de Guerra, pero es más raro verlos en acción.");
             martilloInfo.setVisible(true);
             dispose();
         }
        });
        
        JPane panel = new JPanel();
        panel.add(new JLabel("Elija un titan plox"));
        panel.add(fundadorButton);
        panel.add(ataqueButton);
        panel.add(colosalButton);
        panel.add(acorazadoButton);
        panel.add(hembraButton);
        panel.add(bestiaButton);
        panel.add(mandibulaButton);
        panel.add(cargueroButton);
        panel.add(martilloButton);
        
        add(panel);
        
    }
}

class infoTitanFrame extends JFrame{
    public infoTitanFrame(String nombreTitan, String descripTitan, String imagenNombre){
        setTitle(nombreTitan);
        setSize(1070,710);
        setDeafaultCloseOperation(JFrame.DISPOSE_ON_CLOSE;
        setLocationRelative(null);
        
        JLabel nombreLabel = new JLabel(nombreTitan);
        JTextArea descripTextArea = new JTextArea(descripTitan);
        descripTextArea.setEditable(false);
        JLabel imageLabel = new JLabel();
        
        JButton regresarButton = new JButton("Regresar al menu principal");
        regresarButton.addActionListener(new ActionListener(){
         @Override 
         public void actionPerfomed(ActionEvent e){
             menuCool menu = new menuCool();
             menu.setVisible(true);
             dispose();
         }
        });
        
        JPanel panel = new JPanel();
        panel.add(nombreLabel);
        panel.add(descripTextArea);
        panel.add(imageLabel);
        panel.add(regresarButton);
        
        add(panel);
    }
}
