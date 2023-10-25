

public class Circulo extends Figeometrica {
    private double radio;

    public Circulo(){

    }

    public Circulo(double calcuArea, double calcuPeri, double radio){
        super(calcuArea, calcuPeri);
        this.radio = radio;
    }

    /*public void mostrarCirculo(){
        System.out.println("El radio del circulo es: " + getRadio());
    } */

    public void mostrarPerimetro(){
        try{
            if(getRadio() < 0){
                throw new IllegalArgumentException("No puede ser negativo el radio del circulo");
            }
            double calcuPeri = 2 * Math.PI * radio;
            System.out.println("El perimetro del circulo es: " + calcuPeri);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
    }
    public void mostrarArea(){
        try{
            if(getRadio() < 0){
                throw new IllegalArgumentException("No puede ser negativo el radio del circulo ");
            }
            double calcuArea = Math.PI * radio * radio;
            System.out.println("El area del circulo es: " + calcuArea);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
    }
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
}
