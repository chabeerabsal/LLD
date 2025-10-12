package COPBalance;

import Modellor.ATMMachine;

public class Hundred extends Money {
    public void handleRequest(int money, ATMMachine atmMachine) {
        if (money > 100) {
            int temp = money;
            money = atmMachine.gethundred() * 100 - money;
            int reducedMoney = (atmMachine.getTwoK() * 500 - temp) / 500;
            atmMachine.setFivehundred(reducedMoney);
            if (money > 0) {
                exit();
            }

        } else {
            exit();
        }
    }
    }
