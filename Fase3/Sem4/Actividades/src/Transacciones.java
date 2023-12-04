import java.sql.*;

class FetchRecords{
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/actividades","root","");
        con.setAutoCommit(false);

        Statement stmt=con.createStatement();
        stmt.executeUpdate("insert into emp400 values(190,'abhi',40000)");
        stmt.executeUpdate("insert into emp400 values(191,'umesh',50000)");

        con.commit();
        con.close();
    }
} 