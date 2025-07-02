package Service;

import Modellor.Customer;
import Modellor.ListTaxi;
import Modellor.Taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaxiService {
    //ListTaxi listTaxi = new ListTaxi();
    FeesCalculation feesCalculation = new FeesCalculation();
    public void taxiBooking(Customer customer,ListTaxi listTaxi){
        for(Map.Entry<String,Taxi>mp:listTaxi.getTaxiList().entrySet()){
            Taxi taxi = mp.getValue();
            if(taxi.getAvailabity()==customer.getPickupPoint() && taxi.isAvailable()){
                taxi.isAvailabity(false);
                taxi.setAvailabity(customer.getDropOffPoint());
                double amount=feesCalculation.totalAmount(customer.getPickupPoint(), customer.getDropOffPoint());
                taxi.setEarnings(amount);
                System.out.println(taxi.getId()+"Taxi alloted"+taxi.getEarnings());
            }

        }
    }
}
