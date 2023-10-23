package ejercicio3;
import java.io.IOException;
public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            LeerEntrada lector = new LeerEntrada(System.in);
            while (true) {
                char caracter = lector.getChar();
                try {
                    procesar(caracter);
                } catch (ExcepcionVocal | ExcepcionNumero | ExcepcionBlanco e) {
                    System.out.println("Excepcion: " + e.getMessage());
                } catch (ExcepcionSalida e) {
                    System.out.println("Excepcion de salida: " + e.getMessage());
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
    public static void procesar(char caracter) throws ExcepcionVocal, ExcepcionBlanco,
            ExcepcionNumero, ExcepcionSalida {
        if (Character.isLetter(caracter)) {
            if ("AEIOUaeiou".contains(String.valueOf(caracter))) {
                throw new ExcepcionVocal("Caracter es una vocal: " + caracter);
            }
        } else if (Character.isDigit(caracter)) {
            throw new ExcepcionNumero("Caracter es un numero: " + caracter);
        } else if (Character.isWhitespace(caracter)) {
            throw new ExcepcionBlanco("Caracter es un espacio en blanco: " + caracter);
        } else if (caracter == 'X') {
            throw new ExcepcionSalida("Caracter 'X' indica salida del programa");
        }
    }
}