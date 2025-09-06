import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinQueue;
    PriorityQueue<Integer> downMaxQueue;
    ElevatorCar elevatorCar;
    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinQueue = new PriorityQueue<>();
        downMaxQueue = new PriorityQueue<>((a,b)->b-a);
    }

    public void submitExternalRequest(int floorno,Direction direction){

    }
    public void submitInternalRequest(int floorno,ElevatorCar){
    }
}
