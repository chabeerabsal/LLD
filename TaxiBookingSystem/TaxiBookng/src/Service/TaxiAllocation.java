package Service;

import Modellor.ListTaxi;
import Modellor.Taxi;

public class TaxiAllocation {
    private double earnings = Double.MAX_VALUE;
    private Taxi selectedTaxi = null;

    public Taxi taxiAllocation(ListTaxi taxiList, char customerPickupPoint) {
        for (Taxi taxi : taxiList.getTaxiList()) {
            char availability = taxi.getAvailabity();

            // Taxi is at the pickup point
            if (availability == customerPickupPoint) {
                if (taxi.getEarnings() < earnings) {
                    earnings = taxi.getEarnings();
                    selectedTaxi = taxi;
                }
            }

            // Taxi is before the pickup point
            else if (availability < customerPickupPoint) {
                // fallback option if no taxi is exactly at pickup point
                if (selectedTaxi == null) {
                    selectedTaxi = taxi;
                }
            }
        }
        return selectedTaxi;
    }
}
