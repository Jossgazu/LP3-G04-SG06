package ejercicio06l10f3;
import java.util.*;
public class Main {
    public static <T> T[] copyArray(T[] arr1, T[] arr2) {
        Set<T> set = new HashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2)); 
        return set.toArray(Arrays.copyOf(arr1, set.size())); 
    }
    public static void main(String[] args) {
        String[] arrStrings1 = {"hola", "como", "estas"};
        String[] arrStrings2 = {"hola", "bien", "gracias"};
        String[] resultadoStrings = copyArray(arrStrings1, arrStrings2);
        System.out.println("Arreglo de Strings sin repetidos: " + Arrays.toString(resultadoStrings));
        Producto[] arrProductos1 = {
            new Producto(1, "Producto 1", 10.5),
            new Producto(2, "Producto 2", 20.0)
        };
        Producto[] arrProductos2 = {
            new Producto(2, "Producto 2", 20.0),
            new Producto(3, "Producto 3", 15.75)
        };
        Producto[] resultadoProductos = copyArray(arrProductos1, arrProductos2);
        System.out.println("Arreglo de Productos sin repetidos: " + Arrays.toString(resultadoProductos));
        Persona[] arrPersonas1 = {
            new Persona("12345", "Juan", "Calle A"),
            new Persona("54321", "María", "Calle B")
        };
        Persona[] arrPersonas2 = {
            new Persona("67890", "Pedro", "Calle C"),
            new Persona("12345", "Juan", "Calle A")
        };
        Persona[] resultadoPersonas = copyArray(arrPersonas1, arrPersonas2);
        System.out.println("Arreglo de Personas sin repetidos: " + Arrays.toString(resultadoPersonas));
    }  
}