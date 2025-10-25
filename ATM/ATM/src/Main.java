import Modellor.ATMMachine;
import Modellor.BankAccount;
import Modellor.Card;
import Modellor.User;
import STATE.ATMState;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card= new Card();
        card.setNo(123);
        card.setPin(1234);
        BankAccount bankAccount = new BankAccount();
        User user = new User(card,bankAccount);
        user.getBankAccount().setBalance(1000);
        ATMMachine atmMachine = new ATMMachine();


    }
}