package Modellor;

import STATE.ATMContext;
import STATE.ATMState;
import STATE.IdleState;

public class ATM {
    ATMMachine atmMachine;
    UserController userController;
    //User user;
    ATMState currentState;

    public ATM(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void setAtmState(ATMState atmState) {
        this.currentState = atmState;
    }

    public void verifyUser(User user) {
        if(userController.verifyUser(user))
        {
           setAtmState(new IdleState());
        }
        else{
            System.out.println("Invalid user");
        }
    }


}
