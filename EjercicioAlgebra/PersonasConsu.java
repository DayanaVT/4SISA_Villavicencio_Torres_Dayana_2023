//clientes que han ido a consulta todos los meses
public class PersonasConsu extends Hospital {
    private int consul;

    public PersonasConsu(){

    }

    public PersonasConsu(String nombre, int identi, int consul){
        super(nombre, identi);
        this.consul = consul;
    }

    public int getConsul(){
        return consul;
    }

    public void setConsul(int consul){
        this.consul = consul;
    }
    
}
