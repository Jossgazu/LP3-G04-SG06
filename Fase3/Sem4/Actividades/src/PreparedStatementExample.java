import java.sql.*;
public class PreparedStatementExample {
    public static void main(String args[]){
        try{
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/actividades","root","");

            PreparedStatement stmt=con.prepareStatement("insert into emp400 (name, salary) values(?,?)");
            stmt.setString(1,"Ratan");
            stmt.setString(2,"101");//1 specifies the first parameter in the query

            int i=stmt.executeUpdate();
            System.out.println(i+" records inserted");

            con.close();

        } catch(Exception e) { 
            System.out.println(e);
        }

    }
}
