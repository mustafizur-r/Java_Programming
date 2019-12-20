package Assignment_04;
//import com.mysql.jdbc.Connection;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1/database_assignment"; //database_assignment is the table name
        String user = "root";
        String pass= "";
        String query = "SELECT * FROM `info` WHERE id = 1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection mycon = DriverManager.getConnection(url,user,pass);

        Statement statement = mycon.createStatement();
        ResultSet resultSet;
        resultSet = statement.executeQuery(query);
        resultSet.next();
        String name = resultSet.getString("Name");
        System.out.println("Name is = "+name);
        mycon.close();
        statement.close();


    }
}
//Here The Youtube link
///https://www.youtube.com/watch?v=17DQ5uYJkw4&list=PLF--oIMIGLtmGA22wlYPOhkarnaE73G3j&index=11


