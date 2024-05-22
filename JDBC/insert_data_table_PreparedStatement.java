package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data_table_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String name = "Adarsh";
        String address = "Bihar";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Adarsh@#123");

        PreparedStatement ps = con.prepareStatement("INSERT INTO student (name, address) VALUES (?, ?)");

        ps.setString(1, name);
        ps.setString(2, address);

        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("ok done");
        } else {
            System.out.println("failed");
        }

        ps.close();
        con.close();
    }
}
