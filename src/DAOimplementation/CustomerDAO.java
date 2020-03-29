package DAOimplementation;

import java.util.ArrayList;

public interface CustomerDAO {
    /**
     * when called by the client class it returns an arrayList that has instances of customer class according to the data retrieved from database
     * @return this method returns an ArrayList of Customer
     */
    public ArrayList<Customer> getCustomers();

    /**
     *
     * @param id
     * @returns an instance of Customer according to ID passed as argument
     */
    public Customer findCustomerById(int id);

    /**
     * this method gets an instance of customer class unwraps it get the data separated and put them into database
     * @param customer
     * @return
     */
    public boolean saveCustomer(Customer customer);
}

