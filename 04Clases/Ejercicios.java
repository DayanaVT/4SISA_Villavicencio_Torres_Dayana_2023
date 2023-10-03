//esta clase es la que se encarga de las operaciones de la calculadora y 
//tambien tendra opciones para convertir unidades crear cuadritos magicos 

import java.util.Scanner;

class Ejercicios{

    public static void main(charAt[] args){
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //menu
    public void menu(){
        System.out.println("Ejercicios que ahi les quedan de tarea");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadro magico");
        System.out.println("d.- Desplazamiento de un cuadrito");
        System.out.println("Elija una opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
                //implementamos los metodos
                Ejercicio1();
                break;
            case 'b' :
                Ejercicio2();
                break;
            case 'c' :
                Ejercicio3();
                break;
            case 'd' :
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por jugar :3");
        }
    }

    public void Ejercicio1(){
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos 
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        //calculadora
        double num1 = 0.00, suma = 0.00, multi = 1.00;
        char operacion;

        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
                //vamos a sumar o restar tantos numeros como desee el usuario
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
                    
                    System.out.println("Escriba el numero que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
                break;
            case 'b':
            System.out.println("Para detener la multiplicacion, ingrese el 0");
                
                do{    
                    System.out.println("Escriba el numero que desee multiplicar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        multi *= num1;
                        //multi = multi * num1;
                    }
                                  
                    
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + multi);
                break;
            case 'c':
                System.out.println("Para detener la división, ingrese el 0");
            //ahi hagan la division de tarea :3
            
                break;
            default:
                System.out.println("opcion no valida, ayos UwU/");
                break;
        }


    }

    public void Ejercicio2(){
        //vamos a crear un programa que se encargue de convertir 
        //kg a libras 
        //m/s a km/s
        //m a yardas y millas
        double metros = 0.00, kg = 0.00, velometros = 0.00, cm = 100.00, pulgadas =0.0254, gramos = 1000, libra = 0, kilometroh = 0.00, yardas = 0.9144, millas = 1.609;
        double conversion1, conversion2;

        System.out.println("Selecciona la cantidad que deseas convertir acorde a las sig ");
        System.out.println("a.- Metros a cm y pulgadas");
        System.out.println("b.- Kilogramos a libras y gramos ");
        System.out.println("c. m/s a km/h");
        System.out.println("d.- Metros a yardas y millas");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros =entrada.nextDouble();
                conversion1 = metros * cm;
                conversion2 = metros * pulgadas;
                System.out.println("La cantidad en metros es: " + metros + " de m a cm son: " 
                + conversion1 + " de m a pulgadas son: " + conversion2);
                break;
            case 'b':
                System.out.println("Ingresa los kilogramos que deseas transformar: ");
                kg =entrada.nextDouble();
                conversion1 = kg * gramos;
                conversion2 = kg * libra;
                System.out.println("La cantidad en kg es: " + kg + " de kg a gramos son: " 
                + conversion1 + " de kg a libras son: " + conversion2);
                break;
            case 'c':
                System.out.println("Ingresa los metros sobre segundo que deseas transformar: ");
                velometros =entrada.nextDouble();
                conversion1 = velometros * 3.6;
                System.out.println("La velocidad en metyros sobre segundo es: " + velometros + " , a km/h son: " 
                + conversion1);
                break;
            case 'd':
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros =entrada.nextDouble();
                conversion1 = metros * yardas;
                conversion2 = metros * millas;
                System.out.println("La cantidad en metros es: " + metros + " de metros a yardas son: " 
                + conversion1 + " de metros a millas son: " + conversion2);
                break;
            default:
        }
    }

    public void Ejercicio3() {
        // Cuadro mágico
        int num = 3;
        int[][] cuadro = new int[num][num];
        int temp = 1;
        int iant = 0;
        int jant = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                cuadro[i][j] = 0;
            }
        }
        int i = 0;
        int j = num / 2;
        
        while (temp <= num * num) {
            if (cuadro[i][j] == 0) {
                cuadro[i][j] = temp;
            } else {
                i = iant + 1;
                j = jant;
                cuadro[i][j] = temp;
                }
                
                iant = i;
                jant = j;
                temp++;
                j++;
                i--;
                if (i < 0 && j == num) {
                    i = num - 1;
                    j = 0;
                } else if (i < 0) {
                    i = i + num;
                } else if (j == num) {
                    j = 0;
                }
        }
        for (int x = 0; x < num; x++) {
            String res = "";
            for (int y = 0; y < num; y++) {
                res = res + " " + cuadro[x][y];
            }
        System.out.println(res);
        }
    }
    

    public void Ejercicio4(){
        
    }
    }
}