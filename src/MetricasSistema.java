public class MetricasSistema {
    private static MetricasSistema instancia;
    private int operaciones;
    private int latenciaTotal;
    private int latenciaMax;
    private final int UMBRAL = 3;

    private MetricasSistema() {
        this.operaciones = 0;
        this.latenciaTotal = 0;
        this.latenciaMax = 0;
    }

    public static MetricasSistema getInstancia() {
        if (instancia == null) {
            instancia = new MetricasSistema();
        }
        return instancia;
    }

    public void registrarOperacion(int latencia) {
        this.operaciones++;
        this.latenciaTotal += latencia;
        if (latencia > this.latenciaMax) {
            this.latenciaMax = latencia;
        }
        System.out.println("Métrica registrada - Latencia: " + latencia + "ms");

        // Control interno de capacidad por umbral para limpieza
        if (this.operaciones >= UMBRAL) {
            System.out.println("¡Umbral alcanzado! Limpiando y reseteando métricas acumuladas...");
            this.operaciones = 0;
            this.latenciaTotal = 0;
            this.latenciaMax = 0;
        }
    }

    public void mostrarResumen() {
        System.out.println("--- Resumen de Métricas ---");
        System.out.println("Operaciones acumuladas: " + operaciones);
        System.out.println("Latencia total: " + latenciaTotal + "ms");
        System.out.println("Latencia máxima: " + latenciaMax + "ms");
    }
}