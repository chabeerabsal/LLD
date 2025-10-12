package STATE;

public class ATMContext {

    ATMState atmState;
    ATMContext(){
        atmState=new IdleState();

    }
}
