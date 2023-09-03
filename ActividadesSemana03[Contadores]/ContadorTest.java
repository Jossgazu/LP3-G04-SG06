package contadortest;
public class ContadorTest {
    public static void main(String[] args) {
        Contador c1, c2, c3;
        System.out.println(Contador.acumulador()); //Llama a la variable acumulador (0)
        c1 = new Contador(3);
        c2 = new Contador(10);
        c3 = new Contador();
        c1.inc(); //Incrementa el valor de c1, siendo Valor = 4 y suma dicho a acumulador
        c1.inc(); //Incrementa el valor de c1, siendo Valor = 5 y suma dicho a acumulador
        c2.inc(); //Incrementa el valor de c2, siendo Valor = 11 y suma dicho a acumulador
        System.out.println(c1.getValor()); //Imprime el valor de c1
        System.out.println(c2.getValor()); //Imprime el valor de c2
        System.out.println(c3.getValor());
        System.out.println(Contador.acumulador); //Devuelve el valor de acumulador siendo la suma (16)
        System.out.println("Total de contadores: " + Contador.nContadores);
    }
}
