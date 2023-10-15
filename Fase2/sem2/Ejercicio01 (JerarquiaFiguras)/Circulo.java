package jerarquiafigura;
public class Circulo extends FiguraBidimensional {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    @Override
    public String obtenerDescripcion() {
        return "Circulo";
    }
}