package Service;

import Modellor.Customer;
import Modellor.ListTaxi;
import Modellor.Taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaxiService {
    //ListTaxi listTaxi = new ListTaxi();
    private FeesCalculation feesCalculation;
    public TaxiService(){
        feesCalculation = new FeesCalculation();
    }


    public void taxiBooking(Customer customer,ListTaxi listTaxi){
        TaxiAllocation taxiAllocation = new TaxiAllocation();
        Taxi taxiAvailable=taxiAllocation.taxiAllocation(listTaxi, customer.getPickupPoint());
        if(taxiAvailable!=null){
            taxiAvailable.setAvailabity(customer.getDropOffPoint());
            double totalAmount=feesCalculation.totalAmount(customer.getPickupPoint(), customer.getDropOffPoint());
            taxiAvailable.setEarnings(totalAmount);
            System.out.println("Taxi is available"+taxiAvailable.getId()+"booked"+taxiAvailable.getEarnings());
        }
    }
}
