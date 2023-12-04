// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import javax.sql.RowSetEvent;
// import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
    public static void main(String[] args) throws Exception {
        String usuario = "root";
        String password = "";
        String bd = "actividades";
        String servidor = "localhost";
        String puerto = "3306";

        String cadena = "jdbc:mysql://" + servidor + ":" + puerto + "/" + bd;
        
        // Class.forName("oracle.jdbc.driver.OracleDriver");
        Class.forName("com.mysql.cj.jdbc.Driver");

        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

        rowSet.setUrl(cadena);
        rowSet.setUsername(usuario);
        rowSet.setPassword(password);

        rowSet.setCommand("select * from emp400");
        rowSet.execute();
        while (rowSet.next()) {
            System.out.println("Id: " + rowSet.getString(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Salary: " + rowSet.getString(3));
        }

    }
}