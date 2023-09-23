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
        float precio, resultado, compra = 0 ;
        String nombreproducto;
        String binario = "";
        char letra;
        int edad; //caso 1
        double desc = 0; //caso1
        String respuesta = ""; //caso1
        int tiposgrado, cant_grado;//caso 3
        double celsius, kelvin, rankine, fahrenheit;//caso 3
        int num, positivos = 0;//caso 4
        int negativos = 0; //caso 4
        double base, altura, radio, volumen, perimetro, area; //caso 6
        int t; //case7
        int x, numero; //caso 8
        double facto; //case 8
        int lado ; //caso 9
        int filas; //caso 10
        

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

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    System.out.println("Ingrese su edad: ");
				    edad = entrada.nextInt();

		            if(edad >= 65){
                        desc = 0.4 * 100;
                        System.out.println("El descuento del abono es: " + desc);
						}else 
                        if (edad <= 21){
                            System.out.println("¿Sus padres son socios?, ¿Si o no?");
                            respuesta = entrada.next();
                            if (respuesta.equals( "Si") || respuesta.equals("si")){
                            desc = 0.45 * 100;
                            System.out.println("Tiene un descuento del abono de: " + desc);
                            }else if (respuesta.equals("No") || respuesta.equals("no")){
                                desc = .25 * 100;
                                System.out.println("El descuento del abono es de: " + desc);
                                }
                        }
                        
                    break;
                case 2:
                    //decimal a binario
                    System.out.println("Ingrese un numero entero positivo que desee convertir a binario : ");
                    numbinario = entrada.nextInt();
                    //primero tengo que saber que sea positivo
                    if(numbinario > 0){
                        //se cuantas veces el numero se va a dividir entre 2?
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0" + binario;
                    }else{
                       binario = " No se puede convertir un numero negativo, solo positivos ";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    //convertir temperaturas
                    System.out.println("¿A que tipo de temperatura quiere convertir?");
                    System.out.println("1.- Fahrenheit ");
                    System.out.println("2.- Celsius");
                    System.out.println("3.- Kelvin");
                    System.out.println("4.- Rankine");
					tiposgrado = entrada.nextInt();
					
                    System.out.println("Ingresar la cantidad de grados: ");
                    cant_grado = entrada.nextInt();
					
						if(tiposgrado == 1) {
							celsius = (cant_grado - 32)*5/9; 
							kelvin = (cant_grado - 32)*5/9+273.15;
							rankine = (cant_grado - 32)+491.67;
							System.out.println(cant_grado + " La equivalencia en celsius es: " + celsius + " La equivalencia en kelvin es: " + kelvin +" La equivalencia en rankine es: " + rankine);
						}
						else{
							if(tiposgrado == 2){
								fahrenheit = (cant_grado * ( 9/5 ))+ 32;
								kelvin = cant_grado+273.15;
								rankine = (cant_grado * (9/5))+491.67;
								System.out.println(cant_grado + " La equivalencia en Fahrenheit es: " + fahrenheit + " La equivalencia en kelvin es: " + kelvin +" La equivalencia en rankine es: " + rankine);
							}
							else{
								if (tiposgrado == 3) {
									celsius = cant_grado-273.15;
									fahrenheit = (cant_grado - 273.15) * 9/5+32;
									rankine = (cant_grado - 273.15) * (5/9) + 491.67;
									System.out.println(cant_grado +" La equivalencia en Fahrenheit es: " + fahrenheit + " La equivalencia en celsius es: " + celsius +" La equivalencia en rankine es: " + rankine);
								}
								else{
									if(tiposgrado == 4) {
										celsius = (cant_grado * (9/5)) + 491.67;
										fahrenheit = cant_grado-459.67;
										kelvin = cant_grado * (5/9);
										System.out.println(cant_grado +" La equivalencia en Fahrenheit es: " + fahrenheit +" La equivalencia en celsius es: " + celsius +" La equivalencia en kelvin es: " + kelvin);
									}
									
								}
							}
							
						}
                    break;
                case 4:
                    System.out.println("¿Cuantos numeros desea ingresar?");
                    total = entrada.nextInt();

                    for (int i = 1; i <=total; i++){
                        System.out.println("Ingrese el numero: ");
                        num = entrada.nextInt();

                        if (num > 0){
                            positivos++;
                        }else {
                            negativos++;
                        }
                    }
                    System.out.println("Numeros positivos en total son: " + positivos);
                    System.out.println("Numeros negativos en total son: " + negativos);
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita ");
                    System.out.println("Por favor ingrese el numero que desea comprar ");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto ");
                        cantidadproducto = entrada.nextInt();
                        //operacion
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado; //compra += resultado
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    System.out.println("Seleccione la figura deseada:");
                    System.out.println("1- Rectángulo");
                    System.out.println("2- Triángulo");
                    System.out.println("3- Esfera");
                    System.out.println("4- Cilindro");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la base del rectángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del rectángulo: ");
                            altura = entrada.nextDouble();

                            area = base * altura;
                            perimetro = 2 * (base + altura);

                            System.out.println("Área del rectángulo: " + area);
                            System.out.println("Perímetro del rectángulo: " + perimetro);
                            break;

                        case 2:
                            System.out.print("Ingrese la base del triángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            altura = entrada.nextDouble();

                            area = (base * altura) / 2;
                            perimetro = base * 3;

                            System.out.println("Área del triángulo: " + area);
                            System.out.println("Perímetro del triángulo: " + perimetro);
                            break;

                        case 3:
                            System.out.print("Ingrese el radio de la esfera: ");
                            radio = entrada.nextDouble();
                            volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

                            System.out.println("Volumen de la esfera: " + volumen);
                            break;

                        case 4:
                            System.out.print("Ingrese el radio de la base del cilindro: ");
                            radio = entrada.nextDouble();
                            System.out.print("Ingrese la altura del cilindro: ");
                            altura = entrada.nextDouble();
                            volumen = Math.PI * Math.pow(radio, 2) * altura;

                            System.out.println("Volumen del cilindro: " + volumen);
                            break;

                        default:
                            System.out.println("Opcion invalida");
                            break;
                }
                    break;
                case 7:
                    //tabla 
                   System.out.println("N   |    |     |         |");
                   System.out.println("--------------------------");

                  for (int i = 1; i <= 10; i++) {
                    System.out.print(i + "   | ");
                    System.out.print(10 * i + " | ");
                    System.out.print(100 * i + " | ");
                    System.out.println(1000 * i + "| ");
                    System.out.println("--------------------------");
                  }

                    break;
                case 8:
                    //factorial
                    System.out.println("Ingrese un numero entero positivo que desee calcular: ");
                    numero = entrada.nextInt(); 
                    
                    //si ingresa un numero negativo
                    if(numero < 0){
                        System.out.println("El numero debe ser positivo");
                    }else{
                        facto = 1;
                        for(x = numero; x >= 1; x--){
                            facto = facto * x;
                        }
                        System.out.println("El factorial del numero:  " + numero + " es " + facto);
                    }
                    break;
                case 9:
                    //Dibujito
                    System.out.print("Ingrese el tamaño del lado del cuadrado que desee, entre 1 y 20 por fas: ");
                    lado = entrada.nextInt();

                    if (lado >= 1 && lado <= 20) {
                        for (int i = 1; i <= lado; i++) {
                            for (x = 1; x <= lado; x++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    } else 
                        System.out.println("El tamaño del lado solo puede ser entre el 1 al 20");
                    break;
                case 10:
                    //figura hueca
                    System.out.print("Ingrese el tamaño del lado del cuadrado que desee, entre 1 y 20 por fas: ");
                    lado = entrada.nextInt();

                    if (lado >= 1 && lado <= 20) {
                        for (int i = 1; i <= lado; i++) {
                            for (x = 1; x <= lado; x++) {
                                if (i == 1 || i == lado || x == 1 || x == lado){
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                    } else {
                       System.out.println("El tamaño del lado solo puede ser entre el 1 al 20");
                    } 
                    break;
                case 11:
                    //patrones de codigo
                    System.out.println("Ingrese el numero de filas que desea oor favor: ");
                    filas = entrada.nextInt();

                    for (int i = 1; i <= filas; i++) {
                        for (x = 1; x <= filas; x++) {
                            if ((i + x) % 2 == 0) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 12:
                    //Diamante

                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida plox ");
                    break;
            }

            //aqui adentro preguntar
            System.out.println("¿Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer carcater de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra == 's' ||letra == 'S' );
    }
}
