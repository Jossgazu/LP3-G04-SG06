public class Contacto{
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setNombre(String new_nombre){
        this.nombre = new_nombre;
    }
    public void setTelefono(String new_telefono){
        this.telefono = new_telefono;
    }
    public void setDireccion(String new_direccion){
        this.direccion = new_direccion;
    }
}