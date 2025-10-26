package Modellor;

public class ATM {
    ATMMachine atmMachine;
    UserController userController;
    //User user;

    public ATM(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void verifyUser(User user) {
        if(userController.verifyUser(user))
        {

        }
        else{

        }
    }


}
