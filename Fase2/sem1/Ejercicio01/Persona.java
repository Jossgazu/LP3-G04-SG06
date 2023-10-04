public class Persona {
    static Integer numero=0;
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;
    
    public Persona(int id, String nombre, String apellido, char tipoCliente){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // determine el numero de cuenta
        this.cuenta = new Cuenta(numero);
        this.tipoCliente = tipoCliente;
    }
    public Persona(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // determine el numero de cuenta
        this.cuenta = new Cuenta(numero);
        this.tipoCliente = 'C';
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
    public char getTipoCliente(){
        return tipoCliente;
    }
    public char setTipoCliente(char newTipoCliente) {
        return this.tipoCliente = newTipoCliente;
    }

    public String numeroCuenta(){
        String tipoCuenta = "";
        if (tipoCliente == 'C' || tipoCliente == 'c') {
            tipoCuenta = "C100";
        } else if (tipoCliente == 'B' || tipoCliente == 'b') {
            tipoCuenta = "B500";
        } else if (tipoCliente == 'E' || tipoCliente == 'e') {
            tipoCuenta = "E800";
        }
        numero++;
        return tipoCuenta + numero;
    }



    @Override
    public String toString(){
    // complete con la informacion requerida
    return "Id: " + id +
          "\nNombre: " + nombre +
          "\nApellido: " + apellido +
          "\nNumero de Cuenta: " + numeroCuenta()  + "     Saldo:"+ cuenta.getSaldo();
    }
}