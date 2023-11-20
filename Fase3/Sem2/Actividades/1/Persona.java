public class Persona {
    private Integer Dni;
    private String Nombre;
    private String Direccion;

    public Persona(Integer dni, String nombre, String direccion) {
        Dni = dni;
        Nombre = nombre;
        Direccion = direccion;
    }

    public Integer getDni() {
        return Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    @Override
    public String toString() {
        return "Persona [Dni=" + Dni + ", Direccion=" + Direccion + ", Nombre=" + Nombre + "]";
    }
}
