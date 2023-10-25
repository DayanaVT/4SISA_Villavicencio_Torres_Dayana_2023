
public class PersonalSani extends Hospital {
    //personas atendidas por personal sanitario num 170 y 236
    private int personaAten;

    public PersonalSani(){

    }

    public PersonalSani(String nombre, int identi, int personaAten){
        super(nombre, identi);
        this.personaAten = personaAten;
    }

    public int getPersonaAten(){
        return personaAten;
    }
    
    public void setPersonaAten(int personaAten){
        this.personaAten = personaAten;
    }
    
}
