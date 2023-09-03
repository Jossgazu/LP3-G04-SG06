package contadortest;
public class ContadorTest2 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador(); //Contadores con constructor por defecto
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
    }
}
