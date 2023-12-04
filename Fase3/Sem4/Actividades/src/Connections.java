import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    Connection conectar = null;

    String usuario = "root";
    String password = "";
    String bd = "actividades";
    String servidor = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://" + servidor + ":" + puerto + "/" + bd;

    public Connection estableceConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, password);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver de MySQL");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la DB");
            System.out.println("Código de error: " + e.getErrorCode());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        }

        return conectar;
    }
}