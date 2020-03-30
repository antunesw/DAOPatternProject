package DAOimplementation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        DataSource data = new DataSource();
//           String a = "" ;
//            data.select( a);


            CustomerDAO obj = new MySQLCustomerDAO();

          ArrayList<Customer>customers = obj.getCustomers();
         //  System.out.println(customers);

           Customer c = obj.findCustomerById(126);
            System.out.println(c);
        System.out.println(" Array size:  "+customers.size()+" customers");

        //String query = "INSERT INTO customer (name , phonenumber, address)Values (' "+ name +"',"+ phoneNumber +",'"+ address +"');";

        //obj.saveCustomer();
       // c = obj.findCustomerById();
        System.out.println(c);
        System.out.println(" Array size:  "+customers.size()+" customers");
        System.out.println("In which continent is the country located? [1-7]: "
                + "\n1 - Asia\n2 - Africa\n3 - Oceania\n4 - Europe\n5- Antarctica\n6 - North America \n7 - South America");
//            System.out.println( obj.getCustomers());
//             System.out.println(obj.findCustomerById(3));
//             Customer c = new Customer(0,"Eric",011,"");
//              System.out.println(obj.saveCustomer(c));
    }
}
