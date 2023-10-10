import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora {
    private BiFunction<Double, Double, Double> funcion;
    
    public Calculadora(BiFunction<Double, Double, Double> funcion) {
        this.funcion = funcion;
    }
    
    public double evaluar(double t, double y) {
        return funcion.apply(t, y);
    }
}

public class SolverEulerMejorado {
    public List<Double> resolver(Calculadora ecuacion, double t0, double y0, double h, double tFinal) {
        List<Double> resultadosT = new ArrayList<>();
        List<Double> resultadosY = new ArrayList<>();
        
        double t = t0;
        double y = y0;
        
        while (t <= tFinal) {
            resultadosT.add(t);
            resultadosY.add(y);
            
            double k1 = h * ecuacion.evaluar(t, y);
            double k2 = h * ecuacion.evaluar(t + h, y + k1);
            
            y += 0.5 * (k1 + k2);
            t += h;
        }
        
        return resultadosY;
    }
}

