package STATE;

import Modellor.ATM;
import Modellor.ValidTransaction;

public class SelectOptionState extends ATMState {

    @Override
    void SelectOptionState(ATM atm, ValidTransaction validTransaction) {
        if(validTransaction==ValidTransaction.WITHDRAWAL)
        {
            atm.setAtmState(new WithDrawalState());
        }
        else{
            atm.setAtmState(new CheckBalance());
        }
    }
}
