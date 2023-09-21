/* 
Vamos a crear un rpograma mediante el cual debamos tener un menu
de seleccion para elegir alguna de las 14 opciones siguientes:
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios 
3.- Convertir Temperaturas
4.- Numeero de positivos y negativos
5.- Tiendita
6.- Area y Perimetro
7.- Tabla
8.- Factorial
9.- Dibujitos
10.- Figura Hueca
11.- Patron 
12.- Diamante
13.- Calculadora
14.- Salir
*/

//declarar las librerias que vamos a ocupar
//se debe estructurar el tipo de dato acorde a su entrada
//si es entero obtenerlo como entero, si es char obtenerlo como caracter
import java.util.Scanner;

class EstructurasControl{
    //si declaramos aqui las variables son globales 

    //metodo principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer una instancia, es necesario 1.- Identificar el tipo de objeto 
        //2.- nombrar al objeto 
        //3.- crear al objeto
        Scanner entrada = new Scanner(System.in);
        //crear una instancia del objeto de la entrada por defecto de la computadora
        //vamos a identificar con Scanner el tipo de dato que sse esta instanceando
        //entrada es el objeto que va a poder identificar si es int, double, float, etc

        //es declarar a las variables que se van a utilizar en el programa
        //las variables son 2 tipos: globales y locales
        //si la declaro dentro de un metodo es local

        int opcion, numbinario, total, cantidadproducto, num1;
        float precio, resultado, compra;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            //aqui va todo el programa
            System.out.println("Bienvenido al programa :D ");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");//maestro
            System.out.println("3.- Convertir Temperaturas ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tiendita ");//maestro
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");//maestro
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujito ");//maestro
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            //aqui adentro preguntar
            System.out.println("¿Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer carcater de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra == 's' ||letra == 'S' );
    }
}
