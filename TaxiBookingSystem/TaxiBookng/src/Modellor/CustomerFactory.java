package Modellor;

public class CustomerFactory {
    private int count=0;
    public Customer createCustomer(String Name, char pikupPoint, char dropPoint,int pickupTime) {
        count++;
        String id= "C"+count;
        return new Customer(id,Name,pikupPoint,dropPoint,pickupTime);
    }
}
