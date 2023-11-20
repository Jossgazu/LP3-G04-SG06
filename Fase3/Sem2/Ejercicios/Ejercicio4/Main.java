package ejercicio04f10f3;
public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto(1, "Producto 1", 10.5),
            new Producto(2, "Producto 2", 20.0),
            new Producto(3, "Producto 3", 15.75)
        };
        Buscador<Producto> buscadorProducto = new Buscador<>();
        Producto productoBuscado = new Producto(2, "", 0); 
        int posicionProducto = buscadorProducto.buscarElemento(productos, productoBuscado);
        System.out.println("Posicion del producto encontrado: " + posicionProducto);
        Persona[] personas = {
            new Persona("111", "Juan", "Calle A"),
            new Persona("222", "María", "Calle B"),
            new Persona("333", "Pedro", "Calle C")
        };
        Buscador<Persona> buscadorPersona = new Buscador<>();
        Persona personaBuscada = new Persona("", "María", "");
        int posicionPersona = buscadorPersona.buscarElemento(personas, personaBuscada);
        System.out.println("Posicion de la persona encontrada: " + posicionPersona);
        Estudiante[] estudiantes = {
            new Estudiante("444", "Laura", "Calle D", "Medicina"),
            new Estudiante("555", "Carlos", "Calle E", "Ingeniería"),
            new Estudiante("666", "Laura", "Calle F", "Derecho")
        };

        Buscador<Estudiante> buscadorEstudiante = new Buscador<>();
        Estudiante estudianteBuscado = new Estudiante("", "Laura", "", "Derecho"); 
        int posicionEstudiante = buscadorEstudiante.buscarElemento(estudiantes, estudianteBuscado);
        System.out.println("Posicion del estudiante encontrado: " + posicionEstudiante);
    }
}