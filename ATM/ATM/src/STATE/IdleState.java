package STATE;

import Modellor.ATM;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm) {
       System.out.println("Card is inserted");
       atm.setAtmState(new HasCard());
    }


}
