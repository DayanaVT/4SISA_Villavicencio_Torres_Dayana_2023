/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author dayan
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    //vamos a  rear una lista de personas para registrar 
    ArrayList<Persona> listapersonas = new Arraylist();
    
    //variables
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;
    
    //aqui viene donde aplicamos el polimorfismo
    //ya que vamos a transformar una persona en 
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    
    void menu(){
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog(
                            "Ingresa la opcion deseada: \n"
                                          + "1.- Registrar nuevo Profesor \n"
                                          + "2.- Registrar nuevo Alumno\n"
                                          + "3.- Consultar Alumno\n");
                    
                    if (var == null){
                        System.exit(0);
                    }
                    
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion){
                        case 1:
                            //metodo para solicitar datos
                            pedirDatosProfesor();
                            //se los asignamos a un objeto profesor
                            profesor = new Profesor(num_empleado, nombre, edad);
                            //metodo para guardarlo
                            guardarProfesor();
                            
                            break;
                        case 2: 
                            //metodo para solicitar datos
                            pedirDatosAlumno();
                            //se los asignamos a un objeto profesor
                            alumno = new Alumno(bol, nombre, edad);
                            //metodo para guardarlo
                            guardarAlumno();
                            
                            break;
                        case 3:
                            //metodo para leer el archivo de alumnos
                            leerAlumno();
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            
                    }
                    rep = JOptionPane.showInputDialog("Deseas Repetir?");
                }catch(Exception e){
                    System.out.println("Erros: " + e.getMessage());
                }
            }
        }
    }

    private void pedirDatosProfesor() {
        num_empleado = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de empleado del Profesor:")); 
        nombre = JOptionPane.showInputDialog(
        "Ingresa el nombre del Profesor:");
        edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Profesor: "));
    }

    private void guardarProfesor() {
        //vamos a crear un metodo para guardarlos
        listapersonas.add(profesor);
        guardar();
    }

    private void pedirDatosAlumno() {
        bol = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el numero de boleta del Alumno:")); 
        nombre = JOptionPane.showInputDialog(
        "Ingresa el nombre del Alumno:");
        edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa la edad del Alumno: "));
    }

    private void guardarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void leerAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
