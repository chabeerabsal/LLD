package Modellor;

import STATE.ATMContext;
import STATE.ATMState;
import STATE.IdleState;

public class ATM {
    ATMMachine atmMachine;
    UserController userController;
    //User user;
    ATMContext atmContext;

    public ATM(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public void verifyUser(User user) {
        if(userController.verifyUser(user))
        {
           atmContext.setAtmState(new IdleState());
        }
        else{

        }
    }


}
