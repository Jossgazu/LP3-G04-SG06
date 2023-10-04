
public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco (String nombre ){
        this (nombre, 20);
    }
    public Banco (String nombre, int numCli ){
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }
    // setter y getter
    public String setNombre(String newNombre){
        return nombre = newNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public Persona[] setClientes(Persona[] newClientes){
        return clientes = newClientes;
    }
    public Persona[] getClientes(){
        return clientes;
    }

    public void agregarCliente (Persona persona ){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = persona;
                break;
            }
        }
    }

    
    public Persona darBajaCliente (Persona persona ){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                clientes[i] = null;
                Persona bajaCliente = clientes[i];
                return bajaCliente;
            }
        }
        return null;
    }
    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
        // int position = 0;
        // Persona[] var3 = this.clientes;
        // int var4 = var3.length;
  
        // for(int var5 = 0; var5 < var4; ++var5) {
        //    Persona pi = var3[var5];
        //    if (pi.equals(persona)) {
        //       System.out.println("persona encontrada en clientes \n posicion :" + position);
        //       return position - 1;
        //    }
  
        //    ++position;
        // }
  
        // System.out.println(">No se encontro la posicion retornando 0");
        // return position;
    }
    public void clientesTipo (char tipo ){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i]!=null && clientes[i].getTipoCliente()==tipo) {
                System.out.println(clientes[i]);
            }
        }
    }
    //toString
    // @Override
    // public String toString(){
    //     for (int i = 0; i < clientes.length; i++) {
    //         System.out.println(clientes[i]);
            
    //     }
    //     return "";
    // }
}