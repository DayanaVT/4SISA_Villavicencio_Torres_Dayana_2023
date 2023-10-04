import java.util.*;

public class cadena {

    //como su nombre lo dice las funciones de cadena nos sirven para 
    //poder manipular comparar disernir cadenas de texto

    Scanner entrada = new Scanner(System.in);

    //metodo de cadenas 
    public void cadenas(){

        String s1 = "habia una vez un patito que decia miau miau, y queria un chocolatito";

        //imprimir 
        System.out.println("El tamaño de la cadena es: " + s1.length() );

        //quiero saber si comienza con ??
        System.out.println("La cadena inicia V o F con la palabara Hola?: " 
        + s1.starWith("Hola"));

        //quiero saber si finaliza con ??
        System.out.println("La cadena finaliza V o F con la palabra chocolatito?" 
        + s1.endsWith("chocolatito"));

        //ahora vamos a asignar una cadena mas a partir de una variable

        System.out.println("Ingrese una palabra: ");
        String s2 = entrada.nextLine();

        //vamos a obtener las subcadenas de la palabra 

        System.out.println("Parte de una subcadena de s1 es: " + s1.indexOf("tito"));
    }
}