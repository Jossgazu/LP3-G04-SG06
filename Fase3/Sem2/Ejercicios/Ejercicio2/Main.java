package ejercicio02l10f3;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(array));
        intercambiarElementos(array, 1, 3);
        System.out.println("Array despues del intercambio: " + Arrays.toString(array));
    }
    public static <T> void intercambiarElementos (T[] array, int posicion1, int posicion2) {
        if (posicion1 < 0 || posicion1 >= array.length || posicion2 < 0 || posicion2 >= array.length
                || posicion1 == posicion2) {
            System.out.println("Las posiciones no son validas para el intercambio");
            return;
        }
        T temp = array[posicion1];
        array[posicion1] = array[posicion2];
        array[posicion2] = temp;
    }
}