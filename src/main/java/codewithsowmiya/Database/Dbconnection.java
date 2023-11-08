package codewithsowmiya.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private final static String connectionUrl = "jdbc:mysql://localhost:3306/springdemo";
    private static final String Username = "root";
    private static final String Password = "root";//mysql login password

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//extension from maven sql
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        connection = DriverManager.getConnection(connectionUrl, Username, Password);//call db
        System.out.println("connection" + !connection.isClosed());//close db
        return connection;


    }
}