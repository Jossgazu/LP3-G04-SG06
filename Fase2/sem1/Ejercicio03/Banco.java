
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
                clientes[i] = clientes[clientes.length-1];
                clientes[clientes.length-1] = null;
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
        
    }
    public void clientesTipo (char tipo ){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i]!=null) {
                
                switch (clientes[i].getTipoCliente()) {
                    case 'C':
                        System.out.println(clientes[i]);
                        System.out.println("Tipo de Cuenta: Cliente");
                        break;
                    case 'B':
                        System.out.println(clientes[i]);
                        System.out.println("Tipo de Cuenta: Banca Exclusiva");
                        break;
                    case 'E':
                        System.out.println(clientes[i]);
                        System.out.println("Tipo de Cuenta: Empresarial");
                        break;
                
                    default:
                        break;
                }
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