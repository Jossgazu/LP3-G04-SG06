public class AppMiExcepcion {
    
    public static void main(String[] args) {
        validaPropia(9);
    }
    public static void validaPropia(int n){
        
        try {
            minimo(n);
            System.out.println(n + "es mayor a 10");
        } 
        catch (MiExcepcion e) {
            // e.getMessage();
            System.out.println(e.getMessage());
        }
    }
    public static void minimo(int numero) throws MiExcepcion{
        if (numero <= 10) {
            throw new MiExcepcion("Necesito un numero mayor a 10");
        }
    }
}
