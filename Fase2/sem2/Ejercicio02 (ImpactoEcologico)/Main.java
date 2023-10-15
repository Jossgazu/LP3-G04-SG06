package impactoe;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(10000);
        Auto auto = new Auto(15000);
        Bicicleta bicicleta = new Bicicleta(3000);
        ArrayList<ImpactoEcologico> objetosEcologicos = new ArrayList<>();
        objetosEcologicos.add(edificio);
        objetosEcologicos.add(auto);
        objetosEcologicos.add(bicicleta);
        for (ImpactoEcologico objeto : objetosEcologicos) {
            System.out.println("Tipo de objeto " + objeto.getClass().getSimpleName());
            double impacto = objeto.obtenerImpactoEcologico();
            System.out.println("Impacto ecologico: " + impacto + " Gases de efecto invernadero");
            System.out.println("Emisiones de carbono: " + ((ImpactoEcologico) objeto).getEmisionesCarbono() + " kg por anio");
            System.out.println();
        }
    }
}