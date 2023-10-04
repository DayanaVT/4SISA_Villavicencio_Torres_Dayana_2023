import java.util.*;

public class arregloMatriz {

    public static void main(String[] args){
        /*
        vamos a realizar un arreglo unidimensional y correrlo para ver que hay 
        en cada elemento 
        */

       //comi se define un arreglo
       int arreglo[] = new int[10];
       //estoy definiendo un arreglo de enteros de tamaño 10

       int valor;

       Scanner entrada = new Scanner(System.in);

       //vamos a recorrerlo con un bucle, debido a que conocemos el num de elementos

       for (int i = 0; i < arreglo.length; i++){
        System.out.println("Ingresa el valor de la posicion del arreglo: ");
        arreglo[i] = entrada.nextInt();
       }

       //para saber que almacenamos 
       for (int j = 0; j < arreglo.length; j++){
        System.out.println("Ingresa el valor de la posicion del arreglo: " + arreglo[j] + " valor ");
       }
    }   
}