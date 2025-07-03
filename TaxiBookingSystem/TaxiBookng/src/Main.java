import Modellor.Customer;
import Modellor.CustomerFactory;
import Modellor.ListTaxi;
import Modellor.Taxi;
import Service.TaxiService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CustomerFactory cf = new CustomerFactory();
        Customer customer = cf.createCustomer("chabeer",'A','C',9);
        Customer customer1 = cf.createCustomer("Absal",'B','C',9);
        Customer customer2 = cf.createCustomer("Niyas",'A','B',9);
        Customer customer3 = cf.createCustomer("Niyas",'A','E',9);
        Customer customer4 = cf.createCustomer("Niyas",'A','F',11);
        Taxi taxi=new Taxi("T1","hello",0,'A',9);
        Taxi taxi1=new Taxi("T2","hi",0,'A',9);
        Taxi taxi2=new Taxi("T3","Welcome",0,'A',9);
        Taxi taxi3=new Taxi("T4","gt",0,'A',9);

        ListTaxi listTaxi=new ListTaxi();
        listTaxi.addTaxi(taxi);
        listTaxi.addTaxi(taxi1);
        listTaxi.addTaxi(taxi2);
        listTaxi.addTaxi(taxi3);

        TaxiService taxiService=new TaxiService();
        taxiService.taxiBooking(customer,listTaxi);
        taxiService.taxiBooking(customer2,listTaxi);
        taxiService.taxiBooking(customer1,listTaxi);
        taxiService.taxiBooking(customer3,listTaxi);
        taxiService.taxiBooking(customer4,listTaxi);
    }
}