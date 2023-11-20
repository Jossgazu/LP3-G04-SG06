package ejercicio05l10f3;
public class Main {
    public static void main(String[] args) {
        Integer[] enteros = {1, 2, 3, 4, 5};
        Buscador<Integer> buscadorEntero = new Buscador<>();
        int posicionEntero = buscadorEntero.buscarElemento(enteros, 3);
        System.out.println("Posicion del entero encontrado: " + posicionEntero);
        Double[] decimales = {1.5, 2.7, 3.0, 4.2, 5.9};
        Buscador<Double> buscadorDecimal = new Buscador<>();
        int posicionDecimal = buscadorDecimal.buscarElemento(decimales, 3.0);
        System.out.println("Posicion del decimal encontrado: " + posicionDecimal);
    }
}