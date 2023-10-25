public class RecetaNada extends Hospital {
    //clientes a los que nunca se les ha recetado nada
    private int recetas;

    public RecetaNada(){

    }

    public RecetaNada(String nombre, int identi, int recetas){
        super(nombre, identi);
        this.recetas = recetas;
    }

    public int getRecetas(){
        return recetas;
    }

    public void setRecetas(int recetas){
        this.recetas = recetas;
    }
}
