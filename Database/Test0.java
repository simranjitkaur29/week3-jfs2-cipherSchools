import java.sql.*;

public class Test0 {
    public static void main(String[] args) {
        //connecting to server
        
        String connectionURL="jdbc:mysql://localhost:3306/mart";
        Class.forName("com.sql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(connectionURL);
        System.out.println("Connected to server !!!");
        conn.close();

    }
}
