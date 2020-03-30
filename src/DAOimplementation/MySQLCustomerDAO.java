package DAOimplementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class MySQLCustomerDAO implements  CustomerDAO {

    DataSource db = new DataSource();

    @Override
    public ArrayList<Customer> getCustomers() {

        ArrayList<Customer>customer = new ArrayList<Customer>();

        String query ="SELECT * FROM customer";

        ResultSet rs = db.select(query);
        int id =0 ;
        String name="" ;
        int phoneNumber = 0;
        String address ="";
        Customer c = null;

        try {
            while (rs.next()) {
                id = rs.getInt(1);
                name = rs.getString(2);
                phoneNumber = rs.getInt(3);
                address = rs.getString(4);

                c = new Customer(id,name,phoneNumber,address);
                customer.add(c);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return customer;


    }




    @Override
    public Customer findCustomerById(int id) {

        String name="" ;
        int phoneNumber = 0;
        String address ="";
        Customer c = null;

        String query = "SELECT * FROM customer WHERE id ="+id;

        ResultSet rs = db.select(query);

        try {
            if (rs.next()){

                name = rs.getString(2);
                phoneNumber = rs.getInt(3);
                address = rs.getString(4);

               c =  new Customer(id,name,phoneNumber,address);
                return c ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean saveCustomer(Customer customer) {

      //  int id =0 ;
        String name= customer.getName();
        int phoneNumber = customer.getPhoneNumber();
        String address = customer.getAddress();

        String query = "INSERT INTO customer (name , phonenumber, address)Values (' "+ name +"',"+ phoneNumber +",'"+ address +"');";
              return   db.saveData(query);

    }
}
