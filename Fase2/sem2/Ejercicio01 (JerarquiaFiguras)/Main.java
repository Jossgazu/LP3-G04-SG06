package jerarquiafigura;
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
            new Circulo(5.0),
            new Cuadrado(4.0),
            new Triangulo(3.0, 6.0),
            new Esfera(2.0),
            new Cubo(3.0),
            new Tetraedro(4.0)
        };
        for (Figura figura : figuras) {
            System.out.println("Descripcion: " + figura.obtenerDescripcion());
            if (figura instanceof FiguraBidimensional) {
                System.out.println("Area: " + ((FiguraBidimensional) figura).obtenerArea());
            }
            if (figura instanceof FiguraTridimensional) {
                System.out.println("Area superficial: " + ((FiguraTridimensional) figura).obtenerArea());
                System.out.println("Volumen: " + ((FiguraTridimensional) figura).obtenerVolumen());
            }
        }
    }
}