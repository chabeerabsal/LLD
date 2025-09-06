import java.util.ArrayList;
import java.util.List;

public class InternalButton {
    int[] availableBttons={1,2,3,4,5,6,7,8};
    //ElevatorCar elevatorCar;
    List<ElevatorController> elevatorControllers;
    public void pressButton(int button, ElevatorCar elevatorCar)
    {
        boolean buttonSelcted=false;
        for(int i=0;i<availableBttons.length;i++)
        {
            if(availableBttons[i]==button)
            {
                buttonSelcted=true;
            }
        }

        if(buttonSelcted==true){
            for(ElevatorController elevatorController:elevatorControllers){
                if(elevatorController.elevatorCar==elevatorCar){
                    elevatorController.submitInternalRequest(button);
                }

            }
        }
    }
}
