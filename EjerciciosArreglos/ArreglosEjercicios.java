import java.util.*; 

class ArreglosEjercicios{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion;
        char letra;
        int[] num = new int[10];
        int sumapos = 0, sumaneg = 0, valorpos = 0, valorneg = 0; //caso 1
        double prompos, promneg; //caso 1
        int sumapar = 0, valorpar = 0; //caso 2
        double prompar;//caso 2
        int sumcal = 0, valoraprob = 0, valorep = 0; //caso 3
        int calmax = 0, calmin = 0, calSup = 0; //caso 3
        double promCal = 0; //caso 3

        do{
            System.out.println("Elija el ejercicio que desee realizar: ");
            System.out.println("1.- Promedio valores positivos y negativos");
            System.out.println("2.- Promedio de posiciones de pares");
            System.out.println("3.- Calificaciones");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                //promedio valores positivos y negativos
                for (int i = 0; i < 10; i++){
                    System.out.println("Ingrese el numero entero por fas");
                    num[i] = entrada.nextInt();

                    if(num[i] > 0){
                        sumapos += num[i];
                        valorpos++;
                    } else if(num[i] < 0){
                        sumaneg += num[i];
                        valorneg++;
                    }
                }
                prompos = (double) sumapos / valorpos;
                promneg = (double) sumaneg / valorneg;

                System.out.println("El promedio de los numeros positivos es: " + prompos);
                System.out.println("El promedio de los numeros negativos es: " + promneg);
                break;

                case 2: 
                //promedio posiciones pares
                for (int i = 0; i < 10; i++){
                    System.out.println("Ingrese el numero entero plox");
                    num[i] = entrada.nextInt();

                    //saber si es par
                    if (i % 2 == 0){
                        sumapar += num[i];
                        valorpar++;
                    }
                }
                prompar = (double) sumapar / valorpar;

                System.out.println("El promedio de los numeros en las posiciones pares es: " + prompar);
                break;

                case 3:
                //calificaciones
                for(int i = 0; i < 10; i++){
                    System.out.println("Ingrese la calificacion del alumno por favor: ");
                    num[i] = entrada.nextInt();

                    sumcal += num[i];
                    
                    //calificacion maxima y minima
                    if(num[i] > calmax){
                        calmax = num[i];
                    }
                    if (num[i] < calmin){
                        calmin = num[i];
                    }
                    //reprobados y aprobados
                    if (num[i] >= 6){
                        valoraprob++;
                    }else {
                        valorep++;
                    }
                }
                promCal = (double) sumcal / 10;
                
                for(int i = 0; i < 10; i++){
                    if (num[i] > promCal){
                        calSup++;
                    }
                }
                System.out.println("Las calificaciones son: " );
                for (int i = 0; i < 10; i++){
                    System.out.println("calificaciones: " + num[i]);
                }
                System.out.println("El promedio de las calificaciones son: " + promCal);
                System.out.println("La calificacion mas alta es: " + calmax + " y la mas baja es: " + calmin);
                System.out.println("El numero de calificaciones al promedio es: " + calSup);
                System.out.println("La cantidad de alumnos reprobados es: " + valorep);
                break;

                default:
                System.out.println("Elija una opcion valida plox ");
                break;
            }

            System.out.println("¿Deseas repetir el programa?, escribe s para si");
            letra = entrada.next().charAt(0);

        }while(letra == 's' ||letra == 'S' );
    }
}