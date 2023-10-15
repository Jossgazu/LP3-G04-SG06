public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }

    public void establecerCantidad(int cuenta) {
        cantidad = cuenta;
    }

    public void establecerPrecioPorArticulo(double precio) {
        precioPorArticulo = precio;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
}



