// package 1;

public class CuentaBanco {
    public String titular;
    public Double cantidad;


    public CuentaBanco(String titular){
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public CuentaBanco(String titular, Double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
       
    public String getTitular(){
        return this.titular;
    }
    public String setTitular(String new_titular){
        return this.titular = new_titular;
    }

    public Double getCantidad(){
        return this.cantidad;
    }
    public Double setCantidad(Double new_cantidad){
        return this.cantidad = new_cantidad;
    }

    @Override
    public String toString(){
        return "Cuenta Bancaria{ titular = " + titular + ", cantidad = " + cantidad + "}"; 
    }
    
    public void ingresar(Double cantidad){
        if(cantidad < 0 ) {
            System.out.println("No se realizo ningun cambio");
        } else {
            this.cantidad += cantidad;
        }

    }

    public void retirar(Double new_cantidad){
        if(new_cantidad > this.cantidad){
            Double total = new_cantidad - this.cantidad;
            this.cantidad = new_cantidad - total;
            System.out.println("Te faltan "+ total+" soles");
            this.cantidad = 0.0;
        } else {
            this.cantidad -= new_cantidad;
        }
    }

    public void cantidadDinero(){
        if (this.cantidad > 0){
            System.out.println("Usted tiene: "+ this.cantidad);
        }else{
            System.out.println("Usted no tiene fondos");
        }
    }
}
