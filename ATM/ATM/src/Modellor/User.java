package Modellor;



public class User {
    public User(Card card, BankAccount bankAccount) {
        this.card = card;
        this.bankAccount = bankAccount;
    }


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    private Card card;
    private BankAccount bankAccount;

}
