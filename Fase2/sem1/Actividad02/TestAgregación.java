package relaciónagregaciónactividad02;
public class TestAgregación {
    public static void main(String[] args) {
        Motor motor1 = new Motor(12345, 1000);
        Motor motor2 = new Motor(11111, 4200);
        Automovil auto1 = new Automovil("123ZXY", 4, "Toyota", "Tacoma");
        auto1.setMotor(motor1);
        Automovil auto2 = new Automovil("ABC92C", 2, "Ford", "Focus");
        auto2.setMotor(motor2);
        System.out.println(auto1);
        System.out.println(auto2);
    }
}