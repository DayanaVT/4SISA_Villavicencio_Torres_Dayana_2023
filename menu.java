public class menu {
    public static void menu(String[] args) {
        BiFuntion<Double, Double, Double> funcion = (t, y) -> -2 * t;
        EcuacionDiferencial ecuacion = new EcuacionDiferencial(funcion);

        double t0 = 0;
        double y0 = 0;
        double h = 0.1; //tamaño del paso
        double tFinal = 5.0; //tiempo final

        SolverEulerMejorado solver = new SolverEulerMejorado();
        List<Double> resultadosY = solver.resolver(ecuacion, t0, y0, h, tFinal);

        //resultados
        for (int i = 0; i < resultadosY.size(); i++) {
            double t = t0 + i * h;
            double y = resultadosY.get(i);
            System.out.println("t = " + t + ", y = " + y);
        }
    }
}
