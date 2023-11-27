import java.util.Scanner;
public class Contacts {
    private Dictionary contacts;
    public Contacts() {
        contacts = new Dictionary();
    }
    public void addContact(String dni, String data) {
        contacts.add(dni, data);
        System.out.println("Contacto agregado correctamente.");
    }
    public void deleteContact(String dni) {
        boolean deleted = contacts.delete(dni);
        if (deleted) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }
    public void searchContact(String dni) {
        try {
            String contactData = (String) contacts.getValue(dni);
            System.out.println("Datos del contacto: " + contactData);
        } catch (ObjectNoExistException e) {
            System.out.println("El contacto no existe.");
        }
    }
    public void displayAllContacts() {
        System.out.println("Lista de contactos:");
        System.out.println(contacts.toString());
    }
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("\nMenú de Contactos");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) {
                case 1:
                    System.out.print("Ingrese el DNI del contacto: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese los datos del contacto: ");
                    String data = scanner.nextLine();
                    addContact(dni, data);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del contacto a eliminar: ");
                    String dniToDelete = scanner.nextLine();
                    deleteContact(dniToDelete);
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del contacto a buscar: ");
                    String dniToSearch = scanner.nextLine();
                    searchContact(dniToSearch);
                    break;
                case 4:
                    displayAllContacts();
                    break;
                case 5:
                    System.out.println("Saliendo del menú de contactos...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}