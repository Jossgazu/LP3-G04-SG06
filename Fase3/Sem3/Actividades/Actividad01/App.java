public class App {
    public static void main(String[] args) throws Exception{
        Persona persona = new Persona("Juan", "Perez", "30");
        String msg = persona.contiene("Juan")? "SI tiene Juan" : "NO tiene Juan";
        System.out.println(msg);
    
        Goodies ver = new Goodies(1,"Uno",1.1f);
        String msg1 = ver.contiene(3)? "SI tiene 2" : "NO tiene 2";
        System.out.println(msg1);


        Procedencia procedencia = new Procedencia("Arequipa","Arequipa");
        Estudiante estudiante = new Estudiante("Juan", "Perez", "30", "123456", procedencia);
        String msg2 = estudiante.contiene("Juan")? "SI tiene Juan" : "NO tiene Juan";
        System.out.println(msg2);
    }
}
