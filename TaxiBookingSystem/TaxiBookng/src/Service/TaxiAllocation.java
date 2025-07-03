package Service;

import Modellor.ListTaxi;
import Modellor.Taxi;

public class TaxiAllocation {
    Taxi selectedTaxi = null;
    int minDistance = Integer.MAX_VALUE;
    double minEarnings = Double.MAX_VALUE;

    public Taxi taxiAllocation(ListTaxi taxiList, char customerPickupPoint,int customerPickupTime) {


        for (Taxi taxi : taxiList.getTaxiList()) {
            int distance = Math.abs(taxi.getAvailability() - customerPickupPoint);

            if ((distance < minDistance &&taxi.getFreetime()<=customerPickupTime)||
                    (distance == minDistance && taxi.getEarnings() < minEarnings&&taxi.getFreetime()<=customerPickupTime)) {
                selectedTaxi = taxi;
                minDistance = distance;
                minEarnings = taxi.getEarnings();
            }
        }
        return selectedTaxi;

    }
}
