package jerarquiafigura;
public class Triangulo extends FiguraBidimensional{
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }
    @Override
    public String obtenerDescripcion() {
        return "Triangulo";
    }
}