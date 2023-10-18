import java.util.Scanner;

//Tarea verificar si es palindromo dicha palabra o mensaje

public class Palindromo {

    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {
            String palabMensaje;

            System.out.println("Ingrese la palabra o mensaje que desee en minusculas, por fas: ");
            palabMensaje = entrada.nextLine();

            if(siEspalindromo(palabMensaje)){
                System.out.println("Es un palindromo");
            }else{
                System.out.println("No es un palindromo");
            }
        }
    }

    public static boolean siEspalindromo(String cadena) {

        cadena = cadena.replaceAll(" ", " ");
        int longi = cadena.length();

        for(int i = 0; i < longi / 2; i++){
            if(cadena.charAt(i) != cadena.charAt(longi - i - 1)){
                return false;
            }
        }
        return true;
    }
}
