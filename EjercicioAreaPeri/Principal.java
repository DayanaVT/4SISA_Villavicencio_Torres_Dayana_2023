import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        int op;
        char letra;

        do{
            System.out.println("Selecciona una figura geometrica por fis:D : ");
            System.out.println("1.- Rectangulo");
            System.out.println("2.- Circulo");
            System.out.println("3.- Triangulo");
            System.out.println("4.- Rombo");

            op = entrada.nextInt();

            switch(op) {
                //trainagulo
                case 1:
                   System.out.println("Ingrese la longitud del rectangulo por fis: ");
                   double longitud = entrada.nextDouble();
                   System.out.println("Ingrese el ancho del rectangulo por fis: ");
                   double ancho = entrada.nextDouble();
                  
                   Rectangulo rec = new Rectangulo();
                   rec.mostrarArea();
                   rec.mostrarPerimetro();

                break;

                case 2:
                  System.out.println("Ingrese el radio del círculo: ");
                  double radio = entrada.nextDouble();
                  
                  Circulo cir = new Circulo();
                  cir.mostrarArea();
                  cir.mostrarPerimetro();

                break;

                case 3:
                  System.out.println("Ingrese la base del triángulo: ");
                  double base = entrada.nextDouble();
                  System.out.println("Ingrese la altura del triángulo: ");
                  double altura = entrada.nextDouble();

                  Triangulo triangu = new Triangulo();
                  triangu.mostrarArea();
                  triangu.mostrarPerimetro();
                   

                break;

                case 4:
                  System.out.println("Ingrese el lado del rombo: ");
                  double lado = entrada.nextDouble();
                  System.out.println("Ingrese la longitud de la primera diagonal: ");
                  double diagon = entrada.nextDouble();
                  System.out.println("Ingrese la longitud de la segunda diagonal: ");
                  double diagonal = entrada.nextDouble();

                  Rombo rom = new Rombo();
                  rom.mostrarArea();
                  rom.mostrarPerimetro();

                break;
                default:
                 System.out.println("Opcion no valida :c");
            }
            System.out.println("Deseas repetir el programa?, escribe s para si: ");
            letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S' ); 
            
    }


}
