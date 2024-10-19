package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connecton string
            c = DriverManager.getConnection("jdbc:mysql:///UniversityManagementSystem", "root", "123456789");
            //creating statment
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
