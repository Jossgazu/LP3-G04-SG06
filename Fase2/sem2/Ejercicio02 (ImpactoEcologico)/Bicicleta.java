package impactoe;
public class Bicicleta implements ImpactoEcologico{
    private double distanciaRecorrida;
    private double emisionesCarbono;
    public Bicicleta(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.emisionesCarbono = 0.0;
    }
    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = 0.001 * distanciaRecorrida;
        double factorEmision = 0.05;
        double impactoEcologico = datoActividad * factorEmision;
        this.emisionesCarbono = impactoEcologico;
        return impactoEcologico;
    }
    @Override
    public double getEmisionesCarbono() {
        return emisionesCarbono;
    }
}