package relacionherenciaejercicio04;
public class EmpleadoDistribucion extends Asalariado {
    private String region;
    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region) {
        super(nombre, dni, diasVacaciones, 3500.0); 
        this.region = region;
    }
    public String getRegion() {
        return this.region;
    }
    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }
    @Override
    public double calcularNomina() {
        return super.calcularNomina() + super.calcularNomina() * 0.10;
    }
    @Override
    public String toString() {
        return "Empleado de Distribucion" +
                "\nDni : " + getDni() +
                "\nNombre : " + getNombre() +
                "\nVacaciones : " + getDiasVacaciones() + " dias" +
                "\nZona : " + region +
                "\nSalario : " + calcularNomina();
    }
}
