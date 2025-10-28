package STATE;

import Modellor.ATM;
import Modellor.Card;
import Modellor.User;

public class HasCard extends ATMState {
    @Override
    public void authentication(ATM atm, Card card, int pin){
        boolean isCorrect=card.validataPIN(pin);
        if(isCorrect==true){
            atm.setAtmState(new SelectOptionState());
        }
        else{
            atm.setAtmState(new IdleState());
        }

    }
}
