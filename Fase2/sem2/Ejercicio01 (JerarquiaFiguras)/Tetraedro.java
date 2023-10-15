package jerarquiafigura;
public class Tetraedro extends FiguraTridimensional{
    private double arista;
    public Tetraedro(double arista) {
        this.arista = arista;
    }
    @Override
    public double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }
    @Override
    public double obtenerVolumen() {
        return (Math.pow(arista, 3)) / (6 * Math.sqrt(2));
    }
    @Override
    public String obtenerDescripcion() {
        return "Tetraedro";
    }
}