package COPBalance;

import Modellor.ATMMachine;

public class twoK extends Money {
    public void handleRequest(int money, ATMMachine atmMachine) {
       if(money>2000)
       {
          int temp=money;
          money= atmMachine.getTwoK()*2000-money;
          int reducedMoney=(atmMachine.getTwoK()*2000-temp)/2000;
          atmMachine.setTwoK(reducedMoney);
          if(money>0)
          {
              super(fivehundred);
          }

       }
       else{
           super(fivehundred)
       }

    }
}
