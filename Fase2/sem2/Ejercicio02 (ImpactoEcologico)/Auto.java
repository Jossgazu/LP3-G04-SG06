package impactoe;
public class Auto implements ImpactoEcologico{
    private double kilometrosRecorridos;
    private double emisionesCarbono;
    public Auto(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.emisionesCarbono = 0.0;
    }
    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = 0.01 * kilometrosRecorridos;
        double factorEmision = 0.3;
        double impactoEcologico = datoActividad * factorEmision;
        this.emisionesCarbono = impactoEcologico;
        return impactoEcologico;
    }
    @Override
    public double getEmisionesCarbono() {
        return emisionesCarbono;
    }
}