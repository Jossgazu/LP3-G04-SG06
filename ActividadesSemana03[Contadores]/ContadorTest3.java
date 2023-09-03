package contadortest;
public class ContadorTest3 {
    public static void main(String[] args) {
        Contador c1 = new Contador(); //Contador con valor inicial 10
        Contador c2 = new Contador(3); //Contador con valor inicial 3
        c1.inc();
        c2.inc(); //Incremento de valor de contadores
        //Valor de cada contador:
        System.out.println("Valor de contador 1: " + c1.getValor());
        System.out.println("Valor de contador 2: " + c2.getValor());
        //Valor acumulado:
        System.out.println("Valor acumulado de los contadores " +
                Contador.acumulador());
        //Cantidad de contadores:
        System.out.println("Cantidad de contadores: " + Contador.nContadores);
        // Mostrar el valor inicial del ultimo contador
        System.out.println("Valor inicial del ultimo contador creado: " + Contador.ultimoContador);
    }
}
