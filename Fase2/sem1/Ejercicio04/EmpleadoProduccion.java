package relacionherenciaejercicio04;
public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) {
        super(nombre, dni, diasVacaciones, 3500.0); 
        this.turno = turno;
    }
    public String getTurno() {
        return this.turno;
    }
    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }
    @Override
    public double calcularNomina() {
        return super.calcularNomina() + super.calcularNomina() * 0.15;
    }
    @Override
    public String toString() {
         return "Empleado de Produccion" +
                "\nDni : " + getDni() +
                "\nNombre : " + getNombre() +
                "\nVacaciones : " + getDiasVacaciones() + " dias" +
                "\nTurno : " + turno +
                "\nSalario : " + calcularNomina();
    }
}