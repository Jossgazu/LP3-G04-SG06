
import java.util.Scanner;

public class AdminPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManejadorPersona manejadorPersona = new ManejadorPersona();
        boolean bucle = true;
        while (bucle) {
            System.out.println("1.- Ingresar Personas");
            System.out.println("2.- Ingresar Puntuacion");
            System.out.println("3.- Mostrar Personas");
            System.out.println("5.- Seleccionar Personas");
            System.out.println("6.- Modificar Personas");
            System.out.println("7.- Eliminar Personas");
            System.out.println("8.- Salir");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    manejadorPersona.insertarPersona();
                    break;
                case "2":
                    manejadorPersona.modificarPuntos();
                    break; 
                case "3":
                    manejadorPersona.mostrarAlumnos();
                    break;
                
                case "5":
                    manejadorPersona.seleccionarPersona();
                    break;
                case "6":
                    manejadorPersona.modificarPersona();
                    break;
                case "7":
                    manejadorPersona.eliminarPersonas();
                    break;
                case "8":
                    bucle = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
