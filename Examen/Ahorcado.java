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

        //pistas 
        System.out.println("La palabra a adivinar contiene: " + palabra.length() + " letras");
        System.out.println("La primer letra de la palabra es: " + palabra.charAt(0));
        System.out.println("La ultima letra de la palabra es: " + palabra.charAt(palabra.length() - 1));

        while(intentos > 0){
            System.out.println("La palabra es: " + palabra.charAt(0) + " " + palabra.charAt(palabra.length() - 1));
            System.out.println("Tienes: " + intentos + " intentos");
            System.out.println("Ingresa una letra: ");
            char letra = entrada.next().charAt(0);

            if (isLetterInWord(palabra, letraAdivinada)) {
                System.out.println("Letra correcta");
                puntaje += 10;
            }else {
                System.out.println("Letra incorrecta, introduce otra letra");
                intentos--;
                puntaje -= 5;
            }
        }

    }

    private static boolean isLetterInWord(String palabra, char[] letraAdivinada) {
        return false;
    }
}