public class EmpleadoAsalariado extends Empleado {
    private double SalarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario); 
    }

    public void establecerSalarioSemanal(double salario) {
        SalarioSemanal = salario;
    }
    public double obtenerSalarioSemanal() {
        return SalarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }
}
