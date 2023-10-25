
public class Hospital {
    private String nombre;
    private int identi;

    public Hospital(){

    }

    public Hospital(String nombre, int identi){
        this.nombre = nombre;
        this.identi = identi;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIdenti(){
        return identi;
    }

    public void setIdenti(int identi){
        this.identi = identi;
    }
}
