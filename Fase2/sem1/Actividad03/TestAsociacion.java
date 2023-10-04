public class TestAsociacion {

    public static void main(String[] args) {
        Banco bbva = new Banco("BCP");
        // Banco bbva = new Banco("BBVA",30);

        Persona persona1 = new Persona(1, "Matias", "Quispe",'C');
        Persona persona2 = new Persona(2, "Marcelo", "Quispe",'B');
        Persona persona3 = new Persona(3, "Paolo", "Quispe",'C');

        bbva.agregarCliente(persona1);
        bbva.agregarCliente(persona2);
        bbva.agregarCliente(persona3);


        bbva.darBajaCliente(persona1);

        bbva.clientesTipo('C');

        bbva.buscarCliente(persona3);
   }
}