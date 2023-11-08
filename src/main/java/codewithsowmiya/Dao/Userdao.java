package codewithsowmiya.Dao;

import codewithsowmiya.Database.Dbconnection;
import codewithsowmiya.model.Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Userdao {
    private final Connection connection;

    public Userdao() throws SQLException {
        connection = Dbconnection.getConnection();
    }

    private String INSERT_REGISTER_QUERY = "INSERT INTO Register(Firstname,lastname,Address,Gender,State, City, EmailId,Password) VALUES(?,?,?,?,?,?,?,?)";

    public void RegisterUser(String firstname, String lastname, String address, String gender, String state, String city, String EmailId, String Password) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REGISTER_QUERY);
        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.setString(3, address);
        preparedStatement.setString(4, gender);
        preparedStatement.setString(5, state);
        preparedStatement.setString(6, city);
        preparedStatement.setString(7, EmailId);
        preparedStatement.setString(8, Password);
        int rs=preparedStatement.executeUpdate();
        System.out.println(rs);
    }
}
