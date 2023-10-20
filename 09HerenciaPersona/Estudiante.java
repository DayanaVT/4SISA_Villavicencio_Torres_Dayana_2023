public class Estudiante extends Persona {
    private int numBoleta;
    private String chillon;
    
    public Estudiante(){

    }
    
    public Estudiante(int numBoleta, String nombre, int edad, char genero, String chillon){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        this.chillon = chillon;
    }
    
    public Estudiante(int numBoleta, String nombre, int edad, char genero){
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
    }
    
    //entrada
    public int getnumBoleta(){
        return numBoleta;
    }

    //salida
    public void setnumBoleta(int numBoleta){
        this.numBoleta = numBoleta;
    }

    //entrada
    public String getChillon(){
        return chillon;
    }

    //salida
    public void setnChillon(){
        this.chillon = chillon;
    }
}
