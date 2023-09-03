package proyectorectangulo;
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    private int base;
    private int altura;
    //Index para colores
    private static int colorIndex = 0;
    private static String[] colores = {"Verde", "Amarillo", "Rojo"};

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
        this.color = colores[colorIndex];
        colorIndex = (colorIndex + 1) % colores.length;
        this.base = Math.abs(c2.getX() - c1.getX());
        this.altura = Math.abs(c2.getY() - c1.getY());
    }
    public Rectangulo(int base, int altura) {
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada(base, altura);
        this.color = colores[colorIndex];
        colorIndex = (colorIndex + 1) % colores.length;
        this.base = base;
        this.altura = altura;
    }
    public Coordenada getEsquina1() {
        return this.esquina1;
    }
    public Coordenada getEsquina2() {
        return this.esquina2;
    }
    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }
    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString () {
        return "Rectangulo de base " + base + " y altura " + altura;
    }
}
