package jerarquiafigura;
public class Cubo extends FiguraTridimensional {
    private double lado;
    public Cubo(double lado) {
        this.lado = lado;
    }
    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }
    @Override
    public double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
    @Override
    public String obtenerDescripcion() {
        return "Cubo";
    }
}