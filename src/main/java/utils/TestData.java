package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class TestData {

    public static String name1 ;
    static Connection connection;

    static {
        try {
            connection = getConnection("jdbc:mysql://localhost:3306/logindetails",
                        "root", "mysql@25");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static Statement statement;

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet resultSet;

    static {
        try {
            resultSet = statement.executeQuery("select * from admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public TestData() throws SQLException {
    }

    public static String inputRandomData(){
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static String dataBase() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/logindetails",
                "root", "mysql@25");
        System.out.println("Connected to MySql DataBase");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from admin");
        String name = resultSet.getString("name");
        String password = resultSet.getString("password");
        while (resultSet.next()){
//            String name = resultSet.getString("name");
//            System.out.println("User Name" + name);
//            String password = resultSet.getString("password");
            System.out.println(password);
        }
        return name;
    }
}
