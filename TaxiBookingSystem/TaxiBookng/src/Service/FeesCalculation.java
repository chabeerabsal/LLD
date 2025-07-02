package Service;

import java.util.HashMap;
import java.util.Map;

public class FeesCalculation {

    Map<Character,Integer> map=new HashMap<>();

    FeesCalculation(){
        addValue();
    }


    public double totalAmount(char pickupPoint,char dropPoint)
    {
        double amount=0;
      Integer drop= map.get(dropPoint);
      drop=(drop*200)-200;
      Integer pickup= map.get(pickupPoint);
      pickup=(pickup*200)-200;
      amount=pickup+drop;
      return amount;
    }
    public void addValue(){
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
    }

}
