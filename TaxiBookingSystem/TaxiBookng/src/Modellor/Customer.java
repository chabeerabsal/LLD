package Modellor;

public class Customer {
    private String id;
    private String customerName;
    private char pickupPoint;
    private char dropOffPoint;

   public Customer(String id, String customerName, char pickupPoint, char dropOffPoint) {
        this.id = id;
        this.customerName = customerName;
        this.pickupPoint = pickupPoint;
        this.dropOffPoint = dropOffPoint;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public char getPickupPoint() {
        return pickupPoint;
    }

    public char getDropOffPoint() {
        return dropOffPoint;
    }
}
