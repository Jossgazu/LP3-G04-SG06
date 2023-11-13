import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        try (PrintWriter salida = new PrintWriter("C:\\Users\\josse\\UCSM\\Semestre 4\\Lp3\\Practica\\Pruebas\\33\\ficheros\\datos.txt")) {
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN: ");
            cadena =  scanner.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
