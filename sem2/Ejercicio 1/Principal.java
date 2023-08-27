import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        Integer opcion = 0;
        double cantidad = 0.0;
        Integer inicio;
        Scanner scanner = new Scanner(System.in);
        String titular = "";
        
        CuentaBanco usuario;


        while (titular.equals("") || titular == null) {
            System.out.println("Ingrese el nombre del titular");
            titular = scanner.nextLine();
        }


        System.out.println("1 .-Desea ingresar alguna cantidad?");
        System.out.println("Presione 1");
        System.out.println("En caso contrario presiona cualquier otra tecla");
        inicio = scanner.nextInt();
        if (inicio == 1) {
            System.out.println("Ingrese el monto que desea ingresar");
            cantidad = scanner.nextInt();
            usuario = new CuentaBanco(titular, cantidad);

        } else {
            System.out.println("No se realizo ningun ingreso :D");
            usuario = new CuentaBanco(titular);
        }

        
        System.out.println(usuario);

        do {
            System.out.println("Hola usuario: "+ titular);
            System.out.println("1.- Ingresar Dinero");
            System.out.println("2.- Retirar Dinero");
            System.out.println("3.- Revisar Cuenta Bancaria");
            System.out.println("4.- Salir");

            opcion = scanner.nextInt();
            if(opcion == 1){
                System.out.println("Monto que desee ingresar");
                cantidad = scanner.nextDouble();
                usuario.ingresar(cantidad);
            }else if (opcion == 2) {
                System.out.println("Monto que desea retirar");
                cantidad = scanner.nextDouble();
                usuario.retirar(cantidad);
            }else if (opcion == 3) {
                usuario.cantidadDinero();
            }else {
                System.out.println("Ingrese bien el dato :D");
            }
        } while(opcion != 4);


        scanner.close();
    }
}