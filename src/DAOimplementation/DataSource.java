package DAOimplementation;

import javax.xml.crypto.Data;
import java.sql.*;

public class DataSource {

    private String db = "jdbc:mysql://apontejaj.com:3306/customer";
    private String un = "cctstudent";
    private String pw = "Pass1234!";

    private Connection conn;
    private Statement stmt;
    private ResultSet rs = null;

    public DataSource() {

        try {
            conn = DriverManager.getConnection(db, un, pw);

            stmt = conn.createStatement();


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

    /**
     *Executes query and saves it into the database
     * @param query
     * @return
     */
    public boolean saveData(String query){


        //Executes the Query
        try {
            stmt.execute(query);
            return true;
            //loop through the Result set
//                while (rs.next())
//System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *receives data and returns resultSet
     * @param query
     * @return
     */
    public ResultSet select(String query) {


        //Executes the Query
        try {
            rs = stmt.executeQuery(query);

            //loop through the Result set
//                while (rs.next())
//System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * close connection when it's called
     */
    public void closeConnection() {
        try {
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.fillInStackTrace();
        }

    }
}
