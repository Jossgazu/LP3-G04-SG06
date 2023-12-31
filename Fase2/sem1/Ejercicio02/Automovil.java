package relacionagregaciónejercicio02;
public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;
    public Automovil (String placa, int nPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = nPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        if (motor != null) {
            return "Automovil con motor" +
                    "\nPlaca : " + placa +
                    "\nNo.Motor : " + motor.getNumMotor() + 
                    "\nNo.Puertas : " + numPuertas +
                    "\nMarca : " + marca +
                    "\nModelo : " + modelo +
                    "\nRPM : " + motor.getRevPorMin();
        } else {
            return "Automovil sin motor" +
                    "\nPlaca : " + placa +
                    "\nNo.Puertas : " + numPuertas +
                    "\nMarca : " + marca +
                    "\nModelo : " + modelo;
        }
    }
}
