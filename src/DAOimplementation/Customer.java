package DAOimplementation;

public class Customer {

    private  int id;
    private String name ;
    private int phoneNumber;
    private String address;

    public Customer (int id, String name, int phoneNumber, String address){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "___Customer___ " +'\n'+
                "ID= " + id +'\n'+
                "Name= " + name + '\n' +
                "PhoneNumber= " + phoneNumber +'\n'+
                "Address= " + address + '\n' ;
    }
}
