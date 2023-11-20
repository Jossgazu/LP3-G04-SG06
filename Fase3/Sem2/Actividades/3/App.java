public class App {
    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Persona[] persoArray = {new Persona(1,"Juan","Calle 1"), 
                                new Persona(2,"Pedro","Calle 2"), 
                                new Persona(3,"Maria","Calle 3"),
                                new Persona(4,"Jorge","Calle 4")};
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray,0,3);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray,0,3);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray,0,3);
        System.out.printf("%nArray persoArray contiene:%n");
        imprimirArray(persoArray,0,3);

    }
    // public static void imprimirArray(Integer[] inputArray) {
    //     for(Integer elemento : inputArray)
    //     System.out.printf("%s ",elemento);
    //     System.out.println();
    // }
    // public static void imprimirArray(Double[] inputArray) {
    //     for(Double elemento : inputArray)
    //     System.out.printf("%s ",elemento);
    //     System.out.println();
    // }
    // public static void imprimirArray(Character[] inputArray) {
    //     for(Character elemento : inputArray)
    //     System.out.printf("%s ",elemento);
    //     System.out.println();
    // }
    // public static void imprimirArray(Object[] inputArray) {
    //     for(Object elemento : inputArray)
    //     System.out.printf("%s ",elemento);
    
    //     System.out.println();
    
    // }
    // public static <T> void imprimirArray(T[] inputArray) {
    //     for(T elemento : inputArray)
    //     System.out.printf("%s ",elemento);
    //     System.out.println();
    //     }

    public static <T> void imprimirArray (T[] array, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= array.length) {
            throw new LimiteInvalidoException("Los límites están fuera de rango.");
        }
    
        int contador = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.println(array[i]);
            contador++;
        }
    
        System.out.println("Número de elementos en el rango: " + contador);
    }
}