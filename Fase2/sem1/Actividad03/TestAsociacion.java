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


    //   Banco[] clientesa = new Banco[4];
    //   Persona persona1 = new Persona(1,"Juan0", "Perez");
    //   Persona persona2 = new Persona(2,"Juan1", "Perez");
    //   Persona persona3 = new Persona(3,"Juan2", "Perez");
    //   Persona persona4 = new Persona(4,"Juan3", "Perez");
    //   clientesa[0] = persona1;
    //   clientesa[1] = persona2;
    //   clientesa[2] = persona3;
    //   clientesa[3] = persona4;
    //   Banco b = new Banco("bcp", clientesa);
    //   Persona busca = new Persona(13);
    //   System.out.println(b.buscarCliente(busca));
    //   System.out.println(persona1);
    //   System.out.println(persona2);
    //   System.out.println(persona3);
    //   System.out.println(persona4);
   }
}