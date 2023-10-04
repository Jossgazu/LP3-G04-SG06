public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta (int numero){
        this (numero, 50);
    }


    public void depositar(Double cantidad) {
        saldo += cantidad;
    }
    public void retirar(Double cantidad) {
        if (cantidad<saldo) {
            saldo -= cantidad;
        }
    }


    // setter y getter
    public Integer getNumero(){
        return numero;
    }
    public Integer setNumero(Integer newNumero) {
        return this.numero = newNumero;
    }

    public Double getSaldo(){
        return saldo;
    }
    public Double setSaldo(Double newSaldo) {
        return this.saldo = newSaldo;
    }


    @Override
    public String toString(){
        // complete con la informacion requerida
        return "Numero de Cuenta: "+numero+", Saldo: "+saldo;
    }
}