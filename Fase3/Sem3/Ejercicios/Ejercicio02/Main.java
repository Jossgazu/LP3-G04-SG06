public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("Uno", 1);
        dictionary.add("Dos", 2);
        dictionary.add("Tres", 3);
        System.out.println("Contenido del diccionario:");
        System.out.println(dictionary.toString());
        try {
            System.out.println("Valor para 'Dos': " + dictionary.getValue("Dos"));
            System.out.println("Valor para 'Cuatro': " + dictionary.getValue("Cuatro"));
        } catch (ObjectNoExistException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Eliminando 'Uno': " + dictionary.delete("Uno"));
        System.out.println("Eliminando 'Cinco': " + dictionary.delete("Cinco"));
        System.out.println("Contenido actual del diccionario:");
        System.out.println(dictionary.toString());
    }
}