import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL="jdbc:mysql://localhost/booksdb";
            Connection conn = DriverManager.getConnection(connectionURL,"root","password");
            System.out.println("COnnected to server Succesfully !!!");


            int bid =102;
            String bookTitle="Sql Essentials";
            String author = "Jerry Rig";
            int price = 295;
            String insert =
                    String.format("insert into books values(%d,'%s','%s',%d)",bid,bookTitle,author,price);
            String insertQuery=
                    "insert into books values(101,'jdk by Wrox,'ivor horton',750)";
            String del =
                    String.format("delete from books where id = %d",101);
            Statement stmt = conn.createStatement();
            String selectQuery ="select * from books";
            ResultSet result =stmt.executeQuery(selectQuery);
            while (result.next()){
                System.out.println(result.getString(1)+" "+result.getString(2));

            }
            conn.close();

        }
        catch (Exception e){
    e.printStackTrace();
        }
    }
}