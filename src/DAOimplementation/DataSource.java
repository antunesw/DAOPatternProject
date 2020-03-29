package DAOimplementation;

import javax.xml.crypto.Data;
import java.sql.*;

public class DataSource {

    private String db = "jdbc:mysql://apontejaj.com:3306/customer";
    private String un = "cctstudent";
    private String pw = "pass1234!";

    public DataSource() {

        try {
            Connection conn = DriverManager.getConnection(db, un, pw);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

            while (rs.next())

                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

            rs.close();
            stmt.close();
            conn.close();


        } catch (SQLException se) {
            System.out.println("SQL exceptiom ");
            //loop through SQL exceptions
            while (se != null) {
                System.out.println("State :" + se.getSQLState());
                System.out.println("Message :" + se.getMessage());
                System.out.println("Error :" + se.getErrorCode());

                se = se.getNextException();
            }

        }

    }
}
