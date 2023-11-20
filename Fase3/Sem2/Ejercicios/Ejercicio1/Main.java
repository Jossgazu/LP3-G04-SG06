package ejercicio01l10f3;
public class Main {
    public static void main(String[] args) {
        String[] arrayCadenas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
            "Siete", "Ocho"};
        System.out.println("Array de cadenas contiene:");
        imprimirArray(arrayCadenas);
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ",elemento);
        System.out.println();
    }
    public static void imprimirArray(String[] inputArray) {
        int contador = 0;
        for (String elemento : inputArray) {
            System.out.printf("%s ",elemento);
            contador++;
            if (contador % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}