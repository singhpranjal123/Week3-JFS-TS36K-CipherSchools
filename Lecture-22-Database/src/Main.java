import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String connectionURL="jdbc:mysql://localhost:3306/mart";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(connectionURL);
        System.out.println("COnnected to Server!!!");
        conn.close();


    }
}