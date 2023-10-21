

public class Cuyos extends AdopcionAnimal{
    private String conocido;

    public Cuyos(){

    }

    public Cuyos(String nombre, String raza, String tipo_alimento, int edad, String conocido){
        super(nombre, raza, tipo_alimento, edad);
        this.conocido = conocido;
    }

    //get y set
    public String getConocido(){
        return conocido;
    }

    public void setConocido(String conocido){
        this.conocido = conocido;
    }

    public void mostrarCuyos(){
        System.out.println("El nombre del cuyo es: " + getNombre() + "\n"
                        + "La raza del cuyo es: " + getRaza() + "\n"
                        + "Son mejor conocido como: " + getConocido() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "El cuyo tiene la edad de: " + getEdad() + " años \n");
    }
    
}
