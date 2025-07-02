package Modellor;

public class Taxi {
    private String id;
    private String name;
    boolean isAvailable;
    private double earnings;
    private char availabity;

    public Taxi(String id, String name, boolean isAvailable,char availabity) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        //this.earnings = earnings;
        this.availabity = availabity;
    }
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
    public String getId() {
        return id;
    }

    public void isAvailabity(boolean availabity) {
        this.isAvailable = availabity;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailabity(char availabity) {
        this.availabity=availabity;
    }

    public char getAvailabity() {
        return availabity;
    }

    public double getEarnings() {
        return earnings;
    }
}
