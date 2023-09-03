package contadortest;
public class Contador {
    static int acumulador = 0; //Variable de clase
    final static int VALOR_INICIAL = 10; //Constante
    private int valor; //Variable de instancia
    static int nContadores; //Variable de clase (Numero de contadores)
    static int ultimoContador; //Variable de clase "ultimoContador"
    public static int acumulador() { //Metodo de clase
        return acumulador;
    }
    public Contador(int valor) { //Metodo de instancia
        this.valor = valor;
        Contador.acumulador += valor;
        nContadores++;
        ultimoContador = valor; //Cambia el valor al del ultimo contador
    }
    public Contador() {
       this(Contador.VALOR_INICIAL);
    }
    public void inc() { //Metodo de instancia
        this.valor++;
        acumulador++;
    }
    public int getValor() { //Metodo de instancia
        return this.valor;
    }
}
