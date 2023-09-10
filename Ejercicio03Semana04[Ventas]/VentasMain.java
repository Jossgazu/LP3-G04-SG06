package ventas;
import java.util.Scanner;
public class VentasMain {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double[][] ventas = new double [5][4];
        for (int vend = 0; vend < 4; vend++) {
            System.out.println("Ingrese las ventas para el vendedor " + (vend + 1) + " en dolares");
            for (int prod = 0; prod < 5; prod++) {
                System.out.print("Producto " + (prod + 1) + ": ");
                ventas[prod][vend] = Input.nextDouble();
            }
        }
        double[] totalPorProducto = new double[5];
        double[] totalPorVendedor = new double[4];
        for (int prod = 0; prod < 5; prod++) {
            for (int vend = 0; vend < 4; vend++) {
                totalPorProducto[prod] += ventas[prod][vend];
                totalPorVendedor[vend] += ventas[prod][vend];
            }
        }
        System.out.println("---Resumen de ventas---");
        System.out.print("Producto/Vendedor\t");
        for (int vend = 0; vend < 4; vend++) {
            System.out.print("Vendedor " + (vend + 1) + "\t");
        }
        System.out.println("Total Producto");
        for (int prod = 0; prod < 5; prod++) {
            System.out.print("Producto " + (prod + 1) + "\t\t");
            for (int vend = 0; vend < 4; vend++) {
                System.out.print("$" + ventas[prod][vend] + "\t\t");
            }
            System.out.println("$" + totalPorProducto[prod]);
        }
        System.out.print("Total Vendedor\t\t");
        for (int vend = 0; vend < 4; vend++) {
            System.out.print("$" + totalPorVendedor[vend] + "\t\t");
        }
    }
}
