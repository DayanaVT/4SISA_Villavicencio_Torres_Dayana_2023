
public class Rombo extends Figeometrica {
    private double lado, diagon, diagonal;

    public Rombo(){

    }

    public Rombo(double calcuArea, double calcuPeri, double lado, double diagon, double diagonal){
        super(calcuArea, calcuPeri);
        this.lado = lado;
        this.diagon = diagon;
        this.diagonal = diagonal;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getDiagon(){
        return diagon;
    }

    public void setDiagon(double diagon){
        this.diagon = diagon;
    }

    public double getDiagonal(){
        return diagonal;
    }

    public void setDiagonal(double diagonal){
        this.diagonal = diagonal;
    }

    public void mostrarArea(){
        try{
            if(getDiagon() < 0 || getDiagonal() < 0){
                throw new IllegalArgumentException("Las diagonales no pueden ser negativas");
            }
            double calcuArea = (diagon * diagonal) / 2 ;
    
            System.out.println("El area del rombo es: " + calcuArea);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
    }
    public void mostrarPerimetro(){
        try{
            if(getLado() < 0 || getDiagon() < 0 || getDiagonal() < 0){
                throw new IllegalArgumentException("No pueden ser negativas las diagonales del rombo");
            }
            double calcuPeri = 4 * lado;
            System.out.println("El perimetro del rombo es: " + calcuPeri);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
    }

}
