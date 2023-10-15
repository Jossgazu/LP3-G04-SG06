package impactoe;
public class Edificio implements ImpactoEcologico {
    private double consumoEnergia;
    private double emisionesCarbono;
    public Edificio(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
        this.emisionesCarbono = 0.0;
    }
    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = consumoEnergia;
        double factorEmision = 0.5;
        double impactoEcologico = datoActividad * factorEmision;
        this.emisionesCarbono = impactoEcologico;
        return impactoEcologico;
    }
    @Override
    public double getEmisionesCarbono() {
        return emisionesCarbono;
    }
}