import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        // Boolean hayContacto = true;

        Boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();
        Integer opcion;
        do {
            System.out.println("1.- Añadir Contacto");
            System.out.println("2.- Buscar Contacto");
            System.out.println("3.- Modificar Contacto");
            System.out.println("4.- Borrar Contactos");
            System.out.println("5.- Eliminar Contacto");
            System.out.println("6.- Mostrar Contactos");
            System.out.println("7.- Salir Contacto");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del contacto");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el telefono del contacto");
                    String telefono = scanner.next();
                    System.out.println("Ingrese la direccion del contacto");
                    String direccion = scanner.next();
                    Contacto newContacto = new Contacto(nombre, telefono, direccion);
                    agenda.add(newContacto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto buscado");
                    String buscaNombre = scanner.next();
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().contains(buscaNombre)) {
                            System.out.println("Nombre: " + contacto.getNombre());
                            System.out.println("Telefono: " + contacto.getTelefono());
                            System.out.println("Direccion: " + contacto.getDireccion());
                            break;
                        } else{
                            System.out.println("Contacto no encontrado :C");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a modificar");
                    String nonbre = scanner.next();
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().contains(nonbre)) {
                            System.out.println("Ingrese el nombre del contacto");
                            String nuevoNombre = scanner.next();
                            System.out.println("Ingrese el telefono del contacto");
                            String nuevoTelefono = scanner.next();
                            System.out.println("Ingrese la direccion del contacto");
                            String nuevaDireccion = scanner.next();
                            contacto.setNombre(nuevoNombre);
                            contacto.setNombre(nuevoTelefono);
                            contacto.setNombre(nuevaDireccion);
                        } else{
                            System.out.println("No se encontro el contacto :C");
                        }
                    }
                    break;
                case 4:
                    agenda.clear();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del contacto que desea eliminar");
                    String nombreEliminar = scanner.next();
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().contains(nombreEliminar)) {
                            agenda.remove(contacto);
                            System.out.println("Contacto eliminado");
                            break;
                        }
                    }
                    break;
                case 6:
                    for (Contacto contacto : agenda) {
                        System.out.println("-------------------------------");
                        System.out.println("Nombre:" +contacto.getNombre());
                        System.out.println("Telefono:" +contacto.getTelefono());
                        System.out.println("Direccion:" +contacto.getDireccion());
                        System.out.println("-------------------------------");

                    }
                    break;
                case 7:
                    salir = true;
                    break;
            
                default:
                    break;
            }


        } while (!salir);
        scanner.close();
    }
}