public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[6];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(12, 150.00);

        System.out.println("Facturas, Empleados y Préstamo procesados de forma polimórfica");
        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println("-----------------------------------");
            if (porPagarActual instanceof Factura) {
                Factura factura = (Factura) porPagarActual;
                System.out.println("Factura:");
                System.out.println("Número de pieza: " + factura.obtenerNumeroPieza());
                System.out.println("Cantidad: " + factura.obtenerCantidad());
                System.out.println("Precio por artículo: $" + factura.obtenerPrecioPorArticulo());
            } else if (porPagarActual instanceof EmpleadoAsalariado) {
                EmpleadoAsalariado empleado = (EmpleadoAsalariado) porPagarActual;
                System.out.println("Empleado Asalariado:");
                System.out.println("Nombre: " + empleado.obtenerNombre());
                System.out.println("Número de Seguro Social: " + empleado.obtenerNumeroSeguroSocial());
                System.out.println("Salario Semanal: $" + empleado.obtenerSalarioSemanal());
            } else if (porPagarActual instanceof Prestamo) {
                Prestamo prestamo = (Prestamo) porPagarActual;
                System.out.println(prestamo.toString());
            }
            System.out.println("Pago vencido: $" + porPagarActual.obtenerMontoPago());
            System.out.println("-----------------------------------");
        }
    }
}
