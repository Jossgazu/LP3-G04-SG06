public class Persona {
    static Integer numero = 0;
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Persona(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // determine el numero de cuenta
        this.cuenta = new Cuenta(numero+1);
    }



    // setter y getter
    public Integer getId(){
        return id;
    }
    public Integer setId(Integer newId) {
        return this.id = newId;
    }
    public String getNombre(){
        return nombre;
    }
    public String setNombre(String newNombre) {
        return this.nombre = newNombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String setApellido(String newApellido) {
        return this.apellido = newApellido;
    }
    public Cuenta getCuenta(){
        return cuenta;
    }
    public Cuenta setCuenta(Cuenta newCuenta) {
        return this.cuenta = newCuenta;
    }





    public String toString(){
    // complete con la informacion requerida
    return "Id: " + id +
          " Nombre: " + nombre +
          " Apellido: " + apellido +
          " " +  cuenta;
    }
}