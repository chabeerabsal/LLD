package Modellor;

public class ATM {
    ATMMachine atmMachine;
    User user;
    public ATM(ATMMachine atmMachine, User user) {
        this.atmMachine = atmMachine;
        this.user = user;
    }
}
