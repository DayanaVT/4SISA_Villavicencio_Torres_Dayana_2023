import java.util.Scanner;

public class intento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess;
        char[] guessedLetters;
        int attempts = 3;
        int score = 0;

        System.out.println("¡Bienvenido al juego del ahorcado!");

        // Ingrese la palabra a adivinar
        System.out.print("Ingresa la palabra a adivinar (en minúsculas): ");
        wordToGuess = scanner.nextLine();

        // Crear un arreglo de caracteres para las letras adivinadas
        guessedLetters = new char[wordToGuess.length()];

        System.out.println("La palabra tiene " + wordToGuess.length() + " letras.");
        System.out.println("La primera letra de la palabra es: " + wordToGuess.charAt(0));
        System.out.println("La última letra de la palabra es: " + wordToGuess.charAt(wordToGuess.length() - 1));

        while (attempts > 0) {
            System.out.println("\nPalabra actual: " + displayWord(wordToGuess, guessedLetters));
            System.out.println("Intentos restantes: " + attempts);
            System.out.print("Ingresa una letra: ");
            char guess = scanner.next().charAt(0);

            if (isLetterInWord(wordToGuess, guessedLetters, guess)) {
                System.out.println("¡Letra correcta!");
                score += 10;
            } else {
                System.out.println("Letra incorrecta. Intenta de nuevo.");
                attempts--;
                score -= 5;
            }

            if (wordIsGuessed(wordToGuess, guessedLetters)) {
                System.out.println("¡Felicidades! Has adivinado la palabra correctamente.");
                System.out.println("Tu puntaje final es: " + score);
                break;
            }
        }

        if (attempts == 0) {
            System.out.println("¡Has perdido! La palabra era: " + wordToGuess);
            System.out.println("Tu puntaje final es: " + score);
        }
    }

    // Función para mostrar las letras adivinadas
    public static String displayWord(String word, char[] guessedLetters) {
        StringBuilder display = new StringBuilder();
        for (char letter : word.toCharArray()) {
            if (containsLetter(guessedLetters, letter)) {
                display.append(letter);
            } else {
                display.append("_");
            }
        }
        return display.toString();
    }

    // Función para comprobar si una letra está en la palabra y no ha sido adivinada
    public static boolean isLetterInWord(String word, char[] guessedLetters, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter && guessedLetters[i] == 0) {
                guessedLetters[i] = letter;
                return true;
            }
        }
        return false;
    }

    // Función para comprobar si todas las letras de la palabra han sido adivinadas
    public static boolean wordIsGuessed(String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters[i] == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para comprobar si una letra ya ha sido adivinada
    public static boolean containsLetter(char[] guessedLetters, char letter) {
        for (char guessedLetter : guessedLetters) {
            if (guessedLetter == letter) {
                return true;
            }
        }
        return false;
    }
}
