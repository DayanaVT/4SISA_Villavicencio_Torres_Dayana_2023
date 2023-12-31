
public class Triangulo extends Figeometrica {
    private double base, altura, altura1;
    double calcuArea, calcuPeri;

    public Triangulo(){

    }

    public Triangulo(double calcuArea, double calcuPeri, double base, double altura, double altura1){
        super(calcuArea, calcuPeri);
        this.base = base;
        this.altura = altura;
        this.altura1 = altura1;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura1(){
        return altura1;
    }

    public void setAltura1(double altura1){
        this.altura = altura1;
    }
    public void mostrarTriangulo(){
        try{
            if(getAltura() < 0){
                throw new IllegalArgumentException("No puede ser negativo la altura del triangulo");
            }
            calcuArea = 0.5 * getBase() * getAltura() * getAltura1() ;
    
            System.out.println("El area del triangulo es: " + calcuArea);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
        try{
            if(getAltura() < 0){
                throw new IllegalArgumentException("No puede ser negativo la altura del triangulo");
            }
            double calcuPeri = getBase() + getAltura() + getAltura1();
            System.out.println("El perimetro del triangulo es: " + calcuPeri);
        } catch(IllegalArgumentException e){
            System.out.println("Mal jijij):" + e.getMessage());
        }
    }
    
}
