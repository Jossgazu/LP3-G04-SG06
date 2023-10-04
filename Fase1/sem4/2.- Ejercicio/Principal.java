import java.util.Random;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sueldo=0;
        Integer sueldoH=0;
        Integer sueldoM=0;
        Random random = new Random();
        Integer condition = 0;
        Integer mujeresTrabajo = 0;
        Integer hombresTrabajo = 0;
        Integer trabajaH = 0;
        Integer trabajaM = 0;
        Integer chamba = 0;
        do {
            // System.out.println("Es hombre o mujer?");
            // System.out.println("1.- Es Hombre");
            // System.out.println("2.- Es Mujer");
            Integer sexo = random.nextInt(1,3);
            // System.out.println("Trabaja o no?");
            // System.out.println("1.- Trabaja");
            // System.out.println("2.- Nada");
            Integer trabaja = random.nextInt(1,3);
            if (trabaja==1){
                chamba +=1;
                sueldo = random.nextInt(950,3001);
            } else{
                sueldo=0;
            }
            if (sexo == 1) {
                hombresTrabajo +=1;
                trabajaH +=chamba;
                sueldoH +=sueldo;
            } else{
                mujeresTrabajo +=1;
                trabajaM +=chamba;
                sueldoM +=sueldo;

            }
            condition +=1;

            System.out.println("-----------------------------");
            System.out.println("Sexo: "+sexo);
            System.out.println("Trabaja: "+trabaja);
            System.out.println("Sueldo: "+sueldo);
            System.out.println("-----------------------------");

        } while (condition!=8);
        Double porHombre = (hombresTrabajo/8.0)*100;
        Double porMujeres = (mujeresTrabajo/8.0)*100;
        Double chambaHom = (trabajaH/hombresTrabajo.doubleValue())*100;
        Double chambaMuj = (trabajaM/mujeresTrabajo.doubleValue())*100;
        Double sueldoHom = sueldoH/hombresTrabajo.doubleValue();
        Double sueldoMuj = sueldoM/mujeresTrabajo.doubleValue();
        
        System.out.println("Porcentaje de mujeres: "+porMujeres);
        System.out.println("Porcentaje de hombres: "+porHombre);
        System.out.println("Porcentaje de hombres trabajan: "+chambaHom);
        System.out.println("Porcentaje de mujeres trabajan: "+chambaMuj);
        System.out.println("Sueldo promedio de hombres: "+sueldoHom);
        System.out.println("Sueldo promedio de mujeres: "+sueldoMuj);

        scanner.close();
    }
}