public class Persona implements Contenedora <String> {
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona (String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre () {
        return nombre;
    }
    public String getDireccion () {
        return direccion;
    }
    public String getTelefono () {
        return telefono;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean contiene(String valor){
        return valor.equals(getNombre());
    }

    @Override
    public String toString () {
        return "Nombre: " + nombre + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n";
    }

}
