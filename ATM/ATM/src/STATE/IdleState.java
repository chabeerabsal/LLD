package STATE;

public class IdleState implements ATMState{
    @Override
    public void idleState(){
    }

    @Override
   public void HasCardState(){

    }
    @Override
   public  void SelectOptionState(){

    }
    @Override
    public void CashWithdrawalState(){

    }
    @Override
    public void checkBalanceState(){
        System.out.println("<UNK>");
    }
}
