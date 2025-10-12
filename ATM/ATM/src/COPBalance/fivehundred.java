package COPBalance;

import Modellor.ATMMachine;

public class fivehundred extends Money {
    @Override
    public void handleRequest(int money, ATMMachine atmMachine) {
        if(money>500)
        {
            int temp=money;
            money= atmMachine.getFivehundred()*500-money;
            int reducedMoney=(atmMachine.getTwoK()*500-temp)/500;
            atmMachine.setFivehundred(reducedMoney);
            if(money>0)
            {
                super(hundred);
            }

        }
        else{
            super(hundred);
        }
    }
}
