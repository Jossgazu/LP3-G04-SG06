import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class ManejadorPersona {
    Scanner scanner = new Scanner(System.in);
    
    public ManejadorPersona(){
        Connections con = new Connections();
        con.estableceConnection();
    }

    public void insertarPersona(){
        System.out.println("Ingrese el username de la persona");
        String username = scanner.nextLine();
        insertarPersona(username);
    }
    

    public void insertarPersona(String username){
        
        Connections con = new Connections();


        Persona persona = new Persona();
        persona.setUsername(username);

        String consulta = "INSERT INTO persona (username) VALUES (?)";

        try {
            PreparedStatement ps = con.estableceConnection().prepareStatement("SELECT * FROM persona WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Error: El username ya existe");
                return;
            }

            CallableStatement cs = con.estableceConnection().prepareCall(consulta);

            cs.setString(1, persona.getUsername());
            cs.execute();
            System.out.println("Persona insertada correctamente");
        } catch (Exception e) {
            System.out.println("Error al insertar persona");
            System.out.println(e.getMessage());
        }
    }   

    public void mostrarAlumnos(){
        Connections con = new Connections();


        String sql = "SELECT * FROM persona";
        String[] datos = new String[3];
        try {
            Statement st = con.estableceConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);

                System.out.printf("%s, %s, %s\n", datos[0], datos[1], datos[2]);

            }
        } catch (Exception e) {
            System.out.println("Error al mostrar alumnos");
            System.out.println(e.getMessage());
        }
    }

    public void seleccionarPersona(){
        System.out.println("Ingrese el username de la persona");
        String username = scanner.nextLine();
        seleccionarPersona(username);
    }

    public void seleccionarPersona(String username){
        Connections con = new Connections();
        try {
            PreparedStatement ps = con.estableceConnection().prepareStatement("SELECT * FROM persona WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+"\n");
            }
        } catch (Exception e) {
            System.out.println("Error al seleccionar persona");
            System.out.println(e.getMessage());
        }
    }
    public void modificarPersona(){
        System.out.println("Ingrese el username de la persona");
        String oldUsername = scanner.nextLine();
        System.out.println("Ingrese el nuevo username de la persona");
        String newUsername = scanner.nextLine();
        modificarPersona(oldUsername, newUsername);
    }


    public void modificarPersona(String oldUsername, String newUsername){
        Connections con = new Connections();
        String sql = "UPDATE persona SET username = ? WHERE username = ?";
        try {
            CallableStatement cs = con.estableceConnection().prepareCall(sql);
            cs.setString(1, newUsername);
            cs.setString(2, oldUsername);
            cs.execute();
            System.out.println("Persona modificada correctamente");
        } catch (Exception e) {
            System.out.println("Error al modificar persona");
            System.out.println(e.getMessage());
        }
    }
    public void modificarPuntos(){
        System.out.println("Ingrese el username para modificar puntos");
        String username = scanner.nextLine();
        System.out.println("Ingrese un valor para aumentar o disminuir puntuacion");
        Integer puntuacion = scanner.nextInt();
        modificarPuntos(username, puntuacion);
        
    }


    public void modificarPuntos(String username, Integer puntuacion){
        Connections con = new Connections();
        String sql = "UPDATE persona SET puntuacion = puntuacion + ? WHERE username = ?";
        try {
            CallableStatement cs = con.estableceConnection().prepareCall(sql);
            cs.setInt(1, puntuacion);
            cs.setString(2, username);
            cs.execute();
            System.out.println("Puntuación modificada correctamente");
        } catch (Exception e) {
            System.out.println("Error al modificar puntuación");
            System.out.println(e.getMessage());
        }
    }
    public void eliminarPersonas(){
        System.out.println("Ingrese el username de la persona");
        String username = scanner.nextLine();
        eliminarPersonas(username);
    }

    public void eliminarPersonas(String username){
        Connections con = new Connections();
        String sql = "DELETE FROM persona WHERE username = (?)";
        try {
            CallableStatement cs = con.estableceConnection().prepareCall(sql);
            cs.setString(1, username);
            cs.execute();
            System.out.println("Persona eliminada correctamente");
        } catch (Exception e) {
            System.out.println("Error al eliminar persona");
            System.out.println(e.getMessage());
        }
    }
}