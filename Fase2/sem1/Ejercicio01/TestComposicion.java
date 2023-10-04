public class TestComposicion {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona(1, "Matias", "Quispe",'C');
        Persona persona2 = new Persona(2, "Marcelo", "Quispe",'B');
        Persona persona3 = new Persona(3, "Paolo", "Quispe",'E');

        // Mostrar información de las personas
        persona1.getCuenta().depositar(100.0);
        persona2.getCuenta().depositar(10.0);
        persona3.getCuenta().depositar(1.0);
        
        Persona persona11 = new Persona(1, "Matias", "Quispe");
        Persona persona12 = new Persona(2, "Marcelo", "Quispe");
        Persona persona13 = new Persona(3, "Paolo", "Quispe");

        persona11.getCuenta().retirar(100.0);
        persona12.getCuenta().retirar(10.0);
        persona13.getCuenta().retirar(1.0);


        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println("-------------------------------------");
        System.out.println(persona11);
        System.out.println(persona12);
        System.out.println(persona13);
    }
}
