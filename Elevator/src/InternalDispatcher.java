import java.util.List;

public class InternalDispatcher {
         List<ElevatorController> externalController;

         public void submitInternalRequest(int floorno,ElevatorCar elevatorCar){
                 for(ElevatorController elevator:externalController){
                     if(elevator.elevatorCar.id==elevatorCar.id){
                         elevator.submitInternalRequest(floorno);
                         break;
                     }
                 }
         }

}
