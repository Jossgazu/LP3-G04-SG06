import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binarios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileOutputStream fos = null;
        DataOutputStream salida = null;

        double[][] matriz;
        int filas, columnas, i, j;
        do {
            System.out.println("Numero de Filas: ");
            filas = scanner.nextInt();
        } while (filas <= 0);
        do {
            System.out.println("Numero de Columnas: ");
            columnas = scanner.nextInt();
        } while (columnas <= 0);

        matriz = new double[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.println("matriz["+i+"]["+j+"]");
                matriz[i][j]= scanner.nextDouble();
            }
        }
        try {
            
            fos = new FileOutputStream("./ficheros/matriz.dat");
            salida = new DataOutputStream(fos);

            salida.writeInt(filas);
            salida.writeInt(columnas);

            for (i = 0; i < filas; i++) {
                for (j = 0; j < columnas; j++) {
                    salida.writeDouble(matriz[i][j]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
