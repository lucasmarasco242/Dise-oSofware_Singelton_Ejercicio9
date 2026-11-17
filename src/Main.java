public class Main {
    public static void main(String[] args) {
        MetricasSistema m1 = MetricasSistema.getInstancia();
        MetricasSistema m2 = MetricasSistema.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (m1 == m2));

        m1.registrarOperacion(120);
        m1.registrarOperacion(250);

        m1.mostrarResumen();

        m2.registrarOperacion(90);
        m2.mostrarResumen();
    }
}