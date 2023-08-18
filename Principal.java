package pylab01;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner Input = new Scanner(System.in);
        do {
            vida ++;
            System.out.println("Vida"+ vida + "\t¿Cual es el numero secreto? ");
            rp = Input.nextInt();
            if (rp == 1234)
                fl = true;
            }while(vida < 3 && !fl );
            if (fl == true)
                System.out.println("Adivinaste!!!!! ");
            else
                System.out.println("ups, perdiste... ");
        }
    }
