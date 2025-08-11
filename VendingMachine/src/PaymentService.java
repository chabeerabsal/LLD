import java.util.HashSet;

public class PaymentService {
    private HashSet<Integer> acceptedCoins=new HashSet<>();
    private void validCash()
    {
        acceptedCoins.add(1);
        acceptedCoins.add(5);
        acceptedCoins.add(10);
        acceptedCoins.add(20);
        acceptedCoins.add(50);
    }
    public int cashCalucluation(int money,int quantity,int quantityPrice)
    {
        if(acceptedCoins.contains(money))
        {
            int cash=  money*quantity;
            return cash-quantityPrice;

        }
        return 0;
    }
}
