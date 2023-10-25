//clientes que no han ido a consulta en todo el año
public class PersonNoconsu extends Hospital{
    private int noConsu;

    public PersonNoconsu(){

    }
    
    public PersonNoconsu(String nombre, int identi, int noConsu){
        super(nombre, identi);
        this.noConsu = noConsu;
    }

    public int getNoConsu(){
        return noConsu;
    }

    public void setNoConsu(int noConsu){
        this.noConsu = noConsu;
    }
}
