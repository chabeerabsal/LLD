package STATE;

public interface ATMState {
    void idleState();
    void HasCardState();
    void SelectOptionState();
    void CashWithdrawalState();
    void checkBalanceState();
}
