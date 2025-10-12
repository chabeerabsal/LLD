package COPBalance;

import Modellor.ATMMachine;

abstract class Money {
    private Money money;
    private ATMMachine atmMachine;
    Money(Money money) {
        this.money = money;
    }
   public abstract void handleRequest(int money,ATMMachine atmMachine);


}
