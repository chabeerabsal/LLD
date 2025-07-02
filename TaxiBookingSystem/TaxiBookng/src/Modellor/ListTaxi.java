package Modellor;

import java.util.*;

public class ListTaxi {
    private List<Taxi> taxiList=new ArrayList<>();

    public void addTaxi(Taxi taxi){
        taxiList.add(taxi);
    }
//    public Taxi getTaxiList(String id){
//        return taxiList.get(id);
//    }

    public List<Taxi> getTaxiList() {
        return taxiList;
    }
}
