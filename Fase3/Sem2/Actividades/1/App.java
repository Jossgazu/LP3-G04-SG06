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
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray persoArray contiene:%n");
        imprimirArray(persoArray);

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
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
        System.out.printf("%s ",elemento);
        System.out.println();
        }

    public static <T extends Comparable<T>> T maximo (T x, T y, T z){
        T max = x;
        if(y.compareTo(x) > 0)
        max = y;
        if(z.compareTo(y) > 0)
        max = z;
       
        return max;
        }

    
    // public static Comparable maximo (Comparable x, Comparable y, Comparable z){
    //     Comparable max = x;
    //     if(y.compareTo(x) > 0)
    //     max = y;
    //     if(z.compareTo(y) > 0)
    //     max = z;
        
    //     return max;
    // }
}