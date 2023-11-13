public class Alumno extends Persona {
    private Fecha fechaMatricula;

    // public Alumno(String nombre, String telefono, String direccion, Fecha fechaMatricula) {
    //     super(nombre, telefono, direccion);
    //     this.fechaMatricula = new Fecha();
    //     setFechaMatricula(fechaMatricula);
    // }
    public Alumno(String nif, String nombre, String edad, Fecha fechaMatricula) {
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }
    // public Alumno() {

    // }
    public Fecha getFechaMatricula(){
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula){
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAño(fechaMatricula.getAño());
    }
}
