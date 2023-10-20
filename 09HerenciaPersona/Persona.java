
public class Persona {

    private String nombre;
    private int edad;
    private char genero;
    
    public Persona(){

    }
    
    public Persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(){
        this.edad = edad;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(){
        this.genero = genero;
    }
    
}
