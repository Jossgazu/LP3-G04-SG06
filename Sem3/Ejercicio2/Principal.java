// import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Fecha fecha = new Fecha();        
        System.out.println(fecha);
        Fecha fechaParametrizada1 = new Fecha(15,10,2023);        
        Fecha fechaParametrizada2 = new Fecha(15,10,2023);        
        System.out.println(fechaParametrizada1);
        fecha.leer();
        System.out.println(fecha);
        fecha.bisiesto();
        fecha.diaMes();
        fecha.getDia();
        fecha.getMes();
        fecha.getAño();
        fecha.corta();
        fecha.diasTranscurridos();
        fecha.diaSemana();
        fecha.larga();
        fecha.fechaTras(165);
        fecha.diasEntre(fechaParametrizada1);
        fecha.siguiente();
        fecha.anterior();
        fecha.fechaFutura(1963);
        fecha.copia();
        System.out.println(Fecha.igualQue(fechaParametrizada1, fechaParametrizada2));
        System.out.println(Fecha.menorQue(fechaParametrizada1, fechaParametrizada2));
        System.out.println(Fecha.mayorQue(fechaParametrizada1, fechaParametrizada2));

    }
}
