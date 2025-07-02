package Modellor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTaxi {
    private Map<String,Taxi> taxiList=new HashMap<>();

    public void addTaxi(Taxi taxi){
        taxiList.put(taxi.getId(),taxi);
    }
    public Taxi getTaxiList(String id){
        return taxiList.get(id);
    }

    public Map<String, Taxi> getTaxiList() {
        return taxiList;
    }
}
