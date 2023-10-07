//Este programa permitira jugar ahorcado con amigos

import java.util.Scanner;

class Ahorcado{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String palabra;
        int intentos = 3;
        int puntaje = 0;
        char[] letraAdivinada; //creo el arreglo para las letras que adivine el jugador
        boolean correcto;

        System.out.println("Hola, bienvenidos al juego del ahorcado :D");

        System.out.println("Ingrese la palabra a adivinar en minusculas por fis: ");
        palabra = entrada.next();

        letraAdivinada = new char[palabra.length()];

        //pistas 
        System.out.println("La palabra a adivinar contiene: " + palabra.length() + " letras");
        System.out.println("La primer letra de la palabra es: " + palabra.charAt(0));
        System.out.println("La ultima letra de la palabra es: " + palabra.charAt(palabra.length() - 1));

        while(intentos > 0){
            System.out.println("La palabra es: " + obtenerpalabra(letraAdivinada));
            System.out.println("Tienes: " + intentos + " intentos");
            System.out.println("Ingresa una letra: ");
            char letra = entrada.next().charAt(0);

            correcto = false;
            for (int i = 0; i < palabra.length(); i++){
                if (palabra.charAt(i) == letra && letraAdivinada[i] == 0){
                    letraAdivinada[i] = letra;
                    correcto = true;
                    puntaje += 10;
                }
            }
            if (correcto){
                System.out.println("Letra correcta");
                System.out.println("Tu puntaje es de: " + puntaje);
            } else{
                System.out.println("Letra incorrecta :(, vuelve a intentarlo");
                intentos--;
                System.out.println("Tienes "  + intentos-- + "intentos");
            }
            if (palabra(letraAdivinada)){
                System.out.println("Ganaste, adivinaste la palabra: " + palabra);
                System.out.println("Tu puntaje final es de: " + puntaje);
                break;
            }
        }
        if (intentos == 0){
            System.out.println("Ya no tienes mas intentos");
            System.out.println("La palabra a adivinar era: " + palabra);
            System.out.println("Gracias por jugar, vuelve pronto :3");
        }

    }
    static boolean palabra(char[] letraAdivinada){
        for (char letra: letraAdivinada){
            if (letra == 0){
                return false;
            }
        }
        return true;
    }
    static String obtenerpalabra(char[] letraAdivinada) {
        StringBuilder palabra = new StringBuilder();
        for (char letra : letraAdivinada) {
            if (letra != 0) {
                palabra.append(letra);
            } else {
                palabra.append("_");
            }
        }
        return palabra.toString();
    }
}