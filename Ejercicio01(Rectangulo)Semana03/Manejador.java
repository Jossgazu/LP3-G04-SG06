package proyectorectangulo;
public class Manejador {
    public static double area(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        int base = Math.abs(esquina2.getX() - esquina1.getX());
        int altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }
    public static double perimetro(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        int base = Math.abs(esquina2.getX() - esquina1.getX());
        int altura = Math.abs(esquina2.getY() - esquina1.getY());
        return 2 * (base + altura);
    }
    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setX(esquina1.getX() + puntos);
        esquina2.setX(esquina2.getX() + puntos);
    }
    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setY(esquina1.getY() + puntos);
        esquina2.setY(esquina2.getY() + puntos);
    }
}
