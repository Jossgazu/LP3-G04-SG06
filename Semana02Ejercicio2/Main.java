package ejercicio02.informe02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int MesNac;
        int DiaNac;
        System.out.print("Ingrese el nombre: ");
        String Nombre = Input.nextLine();
        System.out.print("Ingrese el apellido: ");
        String Apellido = Input.nextLine();
        System.out.print("Ingrese el sexo: ");
        String Sexo = Input.nextLine();
        do {
            System.out.print("Ingrese el mes de nacimiento (1-12): ");
            MesNac = Input.nextInt();
        } while (MesNac < 1 || MesNac > 12);
        boolean diaVerf = true;
        do {
            System.out.print("Ingrese el dia de nacimiento: ");
            DiaNac = Input.nextInt();
            if (MesNac == 2) {
                if (DiaNac < 1 || DiaNac > 28) {
                    diaVerf = false;
                }
            } else if (MesNac == 4 || MesNac == 6 || MesNac == 9 || MesNac == 11) {
                if (DiaNac < 1 || DiaNac > 30) {
                    diaVerf = false;
                }
            } else {
                if (DiaNac < 1 || DiaNac > 31) {
                    diaVerf = false;
                }
            }
            if (!diaVerf) {
                System.out.println("El dia que se ha ingresado no es valido.");
            }
        } while (!diaVerf);
        System.out.print("Ingrese el anio de nacimiento: ");
        int AnioNac = Input.nextInt();
        System.out.print("Ingrese la altura (En centimetros): ");
        double Altura = Input.nextDouble();
        System.out.print("Ingrese el peso (En kilogramos): ");
        double Peso = Input.nextDouble();
        PerfilMedico Perfil = new PerfilMedico(Nombre, Apellido, Sexo, DiaNac, MesNac, AnioNac, Altura, Peso);
        System.out.println(Perfil);
        int Edad = Perfil.calcularEdad();
        int FMC = Perfil.calcularFMC();
        String IMC = Perfil.calcularIMC();
        System.out.println("Edad: " + Edad + " anios");
        System.out.println("Frecuencia Cardiaca Maxima (FMC): " + FMC + " ppm");
        System.out.println("Indice de Masa Corporal (IMC): " + IMC);
    }
}
