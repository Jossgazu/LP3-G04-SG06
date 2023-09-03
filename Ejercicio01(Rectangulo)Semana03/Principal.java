package proyectorectangulo;
public class Principal {
    public static void main(String[] args) {
        Rectangulo ultimoRectangulo;
        Coordenada coordenada1 = new Coordenada(2, 3);
        Coordenada coordenada2 = new Coordenada(6, 7);
        Rectangulo rectangulo1 = new Rectangulo(coordenada1, coordenada2);
        System.out.println(rectangulo1);
        ultimoRectangulo = rectangulo1;
        Coordenada coordenada3 = new Coordenada(1, 1);
        Coordenada coordenada4 = new Coordenada(8, 4);
        Rectangulo rectangulo2 = new Rectangulo(coordenada3, coordenada4);
        System.out.println(rectangulo2);
        ultimoRectangulo = rectangulo2;
        //Area y perimetro de rectangulos
        System.out.println("Area del rectangulo 1: " + Manejador.area(rectangulo1));
        System.out.println("Perimetro del rectangulo 2: " + Manejador.perimetro(rectangulo2));
        //Movimiento de rectangulo 1 en el eje x por 3 puntos.
        Manejador.moverX(rectangulo1, 3);
        System.out.println("Nuevo rectangulo 1 despues de moverlo en el eje X: " + rectangulo1);
        //Movimiento de rectangulo 2 en el eje y por -2 puntos
        Manejador.moverY(rectangulo2, -2);
        System.out.println("Nuevo rectangulo 2 despues de moverlo en el eje Y: " + rectangulo2);
        System.out.println("Color del ultimo rectangulo creado: " + ultimoRectangulo.getColor());
        //Al haber dos rectangulos, el ultimo color es amarillo.
    }
}
