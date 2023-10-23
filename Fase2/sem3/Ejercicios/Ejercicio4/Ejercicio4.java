package ejercicio4;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        try {
            int valor = obtenerValor(numeros, 4);
            System.out.println("Valor obtenido: " + valor);
        } catch (IndiceFueraDeLimitesException e) {
            System.out.println("Error: Indice fuera de limites");
        }
    }
    public static int obtenerValor(int[] arreglo, int indice) throws IndiceFueraDeLimitesException {
        if (indice < 0 || indice >= arreglo.length) {
            throw new IndiceFueraDeLimitesException("Indice fuera de rango");
        }
        return arreglo[indice];
    }
}