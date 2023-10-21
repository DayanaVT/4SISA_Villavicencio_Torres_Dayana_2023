

public class Principal {

    public static void main(String[] args){
        Perros waof = new Perros("Pato", "Schnoodle", "Croquetas olor a vainilla", 5, "Chino de color perla");
        waof.mostrarPerros();
        Hamster hams = new Hamster("Ratatouille", "Ruso", "Semillas, nueces, frutas", 2, "Blanco");
        hams.mostrarHamster();
        Conejos nam = new Conejos("Lita", "Belier", "Zanahoria, lechuga, apio", 1, 2);
        nam.mostrarConejos();
        Cuyos cui = new Cuyos("Kuromi", "Coronet", "Heno, verduras, semillas", 3, "Conejillo de indias");
        cui.mostrarCuyos();
        Hurones nes = new Hurones("Willy", "Comun", "Pollo, ternera y cordero", 2, "afecto, es muy cariñoso" );
        nes.mostrarHurones();
        Tortuga tortu = new Tortuga("Thor", "Estrellada", "Hierbas y frutas", 2, "Lineas amarrilas que forman estrellas" );
        tortu.mostrarTortuga();
    }
    
}
