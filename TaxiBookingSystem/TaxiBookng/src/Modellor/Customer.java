package Modellor;

public class Customer {
    private String id;
    private String customerName;
    private char pickupPoint;
    private char dropOffPoint;
    private int pickupTIme;

   public Customer(String id, String customerName, char pickupPoint, char dropOffPoint,int pickupTIme) {
        this.id = id;
        this.customerName = customerName;
        this.pickupPoint = pickupPoint;
        this.dropOffPoint = dropOffPoint;
        this.pickupTIme = pickupTIme;
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

    public int getPickupTime() {
       return pickupTIme;
    }
}
