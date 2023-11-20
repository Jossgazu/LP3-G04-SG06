package ejercicio04f10f3;
public class Persona {
    private String dni;
    private String nombres;
    private String direccion;
    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return nombres.equals(persona.nombres);
    }
}