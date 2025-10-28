package STATE;

import Modellor.ATM;
import Modellor.User;
import Modellor.ValidTransaction;

public abstract class ATMState {
    void insertCard(ATM atm) {

    }
    void authentication(ATM atm, User user) {

    }

    void HasCardState() {

    }

    void SelectOptionState(ATM atm, ValidTransaction validTransaction) {

    }

    void CashWithdrawalState() {

    }

    void checkBalanceState(ATM state) {

    }

    void exit()
    {

    }

}
