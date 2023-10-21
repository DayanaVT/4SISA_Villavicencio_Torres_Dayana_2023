
public class Conejos extends AdopcionAnimal {
    private int manchas;

    public Conejos(){

    }

    public Conejos(String nombre, String raza, String tipo_alimento, int edad, int manchas){
        super(nombre, raza, tipo_alimento, edad);
        this.manchas = manchas;
    }

    //get y set
    public int getManchas(){
        return manchas;
    }

    public void setManchas(int manchas){
        this.manchas = manchas;
    }

    public void mostrarConejos(){
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                        + "La raza del conejo es: " + getRaza() + "\n"
                        + "Se alimenta de: " + getTipo_Alimento() + "\n"
                        + "El conejo tiene la edad de: " + getEdad() + " año \n"
                        + "El conejo tiene " + getManchas() + " manchas \n" );
    }
}
