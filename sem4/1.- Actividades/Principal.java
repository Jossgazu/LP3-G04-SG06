import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        //Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        // int matriz[][] = {{1,1,1,2},                 // fila 0
        //                   {1,1,2,1},                 // fila 1 
        //                   {1,2,1,1},                 // fila 2
        //                   {2,1,1,1}};                // fila 3
        // System.out.println(matriz.length);
        
        //Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna;
        
        //Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;
        // boolean rellenado = true;
        
        //Menu
        do {
            //Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Hallar la media de los valores de la matriz");
            System.out.println("7. Salir");
            System.out.println("Elije una opcion");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    rellenarMatriz(scanner, matriz);
                    //Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                    
                case 2:
                    if (rellenado) {
                        //Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = scanner.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila
                            + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;

                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una columna");
                            columna = scanner.nextInt();

                        } while (!(columna >=0 && columna < matriz.length));
                        System.out.println("La suma de valores de la columa es " + columna
                            + " es: " + sumarColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (rellenado){
                        System.out.println("La suma de la diagonal principal es: " + sumarDiagonal(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;

                case 5:
                    if (rellenado){
                        System.out.println("La suma de la diagonal inversa es: " + sumarInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;

                case 6:
                    if (rellenado){
                        System.out.println("La media de todos los valores es: " + mediaMatriz(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;

                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);

        System.out.println("FIN");

    }
    /**
     * Rellena la matriz con valores insertados por el usuario
     *
     * @param scanner
     * @param matriz
     */
    public static void rellenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Escribe un numero en la posicion [" + i + "] [" + j + "] ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    /**
     * Suma los valores de una determinada fila
     *
     * @param matriz
     * @param fila
     * @return
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }

        return suma;
    }

    public static Integer sumarColumna(int[][] matriz, Integer columna){
        Integer suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static Integer sumarDiagonal(int[][] matriz){
        Integer suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static Integer sumarInversa(int[][] matriz){
        Integer suma = 0;
        Integer resta = matriz.length;
        for (int i = 0; i < matriz.length; i++) {
                resta -=1;
                suma += matriz[i][resta];
        }
        return suma;
    }

    public static Integer mediaMatriz(int [][]matriz){
        Integer suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}

