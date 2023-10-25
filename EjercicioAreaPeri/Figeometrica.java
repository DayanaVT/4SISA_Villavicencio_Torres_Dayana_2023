

public class Figeometrica {
    private double calcuArea, calcuPeri;

    public Figeometrica(){

    }

    public Figeometrica(double calcularArea, double calcularPeri){
        this.calcuArea = calcularArea;
        this.calcuPeri = calcularPeri;
    }

    public double getCalcuArea(){
        return calcuArea;
    }

    public void setCalcuArea(double calcuArea){
        this.calcuArea = calcuArea;
    }

    public double getCalcuPeri(){
        return calcuPeri;
    }

    public void setCalcuPeri(double calcuPeri){
        this.calcuPeri = calcuPeri; 
    }
    
}
