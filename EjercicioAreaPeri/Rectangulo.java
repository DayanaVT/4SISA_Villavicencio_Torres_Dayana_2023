
public class Rectangulo extends Figeometrica {
    private double longitud;
    private double ancho;

    public Rectangulo(){

    }

    public Rectangulo(double calcuArea, double calcuPeri, double longitud, double ancho){
        super(calcuArea, calcuPeri);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double getLongitud(){
        return longitud;
    }

    public void setLongitud(double longitud){
        this.longitud = longitud;
    }

    public double getAncho(){
        return ancho;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public void mostrarArea() {
        try {
            if (getLongitud() < 0 || getAncho() < 0) {
                throw new IllegalArgumentException("La longitud y el ancho del rectángulo no pueden ser negativos");
            }
            double calcuArea = longitud * ancho;
            System.out.println("El área del rectángulo es: " + calcuArea);
        } catch (IllegalArgumentException e) {
            System.out.println("Mal jijij " + e.getMessage());
        }
    }

    public void mostrarPerimetro() {
        try {
            if (getLongitud() < 0 || getAncho() < 0) {
                throw new IllegalArgumentException("El ancho y la altura del rectángulo no pueden ser negativos");
            }
            double calcuPeri = 2 * (longitud + ancho);
            System.out.println("El perímetro del rectángulo es: " + calcuPeri);
        } catch (IllegalArgumentException e) {
            System.out.println("Mal jijiji " + e.getMessage());
        }
    }
    
}
