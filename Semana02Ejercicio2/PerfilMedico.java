package ejercicio02.informe02;
import java.time.LocalDate;
import java.time.Period;
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNac;
    private int mesNac;
    private int anioNac;
    private double altura;
    private double peso;
    public PerfilMedico(String nombre, String apellido, String sexo, int diaNac, int mesNac, int anioNac, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
        this.altura = altura;
        this.peso = peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }
    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }
    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public int getDiaNac() {
        return diaNac;
    }
    public int getMesNac() {
        return mesNac;
    }
    public int getAnioNac() {
        return anioNac;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public int calcularEdad() {
        LocalDate FAct = LocalDate.now();
        LocalDate FNac = LocalDate.of(anioNac, mesNac, diaNac);
        Period Interv = Period.between(FNac, FAct);
        return Interv.getYears();
    }
    public int calcularFMC() {
        int edad = calcularEdad();
        return 208 - (int) (0.7 * edad);
    }
    public String calcularIMC() {
        double imc = peso / ((altura / 100.0) * (altura / 100.0));
        return String.format("%.2f", imc);
    }
    @Override
    public String toString() {
        return "---Perfil medico---\n" +
               "Nombre: " + nombre + " " + apellido + "\n" +
               "Sexo: " + sexo + "\n" +
               "Fecha de nacimiento: " + diaNac + "/" + mesNac + "/" + anioNac + "\n" +
               "Altura: " + altura + " cm\n" +
               "Peso: " + peso + " kg";
    }
 }