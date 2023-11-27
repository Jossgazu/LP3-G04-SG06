public class Procedencia {
    private String departamento;
    private String provincia;

    public Procedencia (String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }
    public String getDepartamento () {
        return departamento;
    }
    public String getProvincia () {
        return provincia;
    }
    public void setDepartamento (String departamento) {
        this.departamento = departamento;
    }
    public void setProvincia (String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString () {
        return "Departamento: " + departamento + "\n" +
               "Provincia: " + provincia + "\n";
    }
}
