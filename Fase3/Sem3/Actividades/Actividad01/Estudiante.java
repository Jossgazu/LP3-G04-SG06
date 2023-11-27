public class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencia;


    public Estudiante (String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;

    }
    public String getNombre () {
        return super.getNombre();
    }

    public String getEspecialidad () {
        return especialidad;
    }
    public Procedencia getProcedencia () {
        return procedencia;
    }
    public void setEspecialidad (String especialidad) {
        this.especialidad = especialidad;
    }
    public void setProcedencia (Procedencia procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public boolean contiene(String valor) {
        return valor.equals(getNombre()) || valor.equals(procedencia.getDepartamento()) || valor.equals(procedencia.getProvincia());
    }

    @Override
    public String toString () {
        return super.toString() +
               "Especialidad: " + especialidad + "\n" +
               "Procedencia: " + procedencia + "\n";
    }
    

}
