//Este programa permitira jugar ahorcado con amigos

import java.util.Scanner;

class Ahorcado{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String palabra;
        int intentos = 3;
        int puntaje = 0;
        char[] letraAdivinada; //creo el arreglo para las letras que adivine el jugador

        System.out.println("Hola, bienvenidos al juego del ahorcado :D");

        System.out.println("Ingrese la palabra a adivinar en: ");
        palabra = entrada.next();

        letraAdivinada = new char[palabra.length()];

        while(intentos > 0){
            System.out.println("Ingresa ");
            char letra = entrada.next().charAt(0);
        }

    }
}