import java.util.List;

public class ExternalDispatcher {
    Direction direction;
    int floor;
    List<ElevatorController> elevators=ElevatorCreater.elevators;

    public void submitRequest(Direction direction, int floor){
          for(ElevatorController elevator:elevators){
              if(elevator.elevatorCar.id%2==1&&floor%2==1){
                  elevator.submitExternalRequest(floor,direction);
              }
              if(floor%2==0&&elevator.elevatorCar.id%2==0){
                  elevator.submitExternalRequest(floor,direction);
              }
          }
    }
}
