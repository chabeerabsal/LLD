package STATE;

public class ATMContext {

    ATMState atmState;
    ATMContext(){
        atmState=new IdleState();
    }

    public ATMState getAtmState() {
        return atmState;
    }
    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }


}
