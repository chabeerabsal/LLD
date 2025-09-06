import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {
    PriorityQueue<Integer> upMinQueue;
    PriorityQueue<Integer> downMaxQueue;
    Queue<Integer> elevatorDownQueue;
    Queue<Integer> elevatorUpQueue;
    ElevatorCar elevatorCar;
    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinQueue = new PriorityQueue<>();
        downMaxQueue = new PriorityQueue<>((a,b)->b-a);
        elevatorUpQueue = new LinkedList<>();
        elevatorDownQueue = new LinkedList<>();
    }

    public void submitExternalRequest(int floorno,Direction direction){
        lookLogic(floorno,direction);
        controlElevtor();

    }
    public void lookLogic(int floorno,Direction direction){
        if(direction==Direction.UP){
            if(upMinQueue.size()==0){
                upMinQueue.offer(floorno);
            }
            else if(upMinQueue.peek()>floorno){
                elevatorUpQueue.offer(floorno);
            }
        }
        else if(direction==Direction.DOWN){
            if(downMaxQueue.size()==0){
                downMaxQueue.offer(floorno);
            }
            else if(downMaxQueue.peek()<floorno){
                elevatorDownQueue.offer(floorno);
            }
        }

    }
    public void submitInternalRequest(int floorno){
        lookLogic(floorno,elevatorCar.direction);
        controlElevtor();
    }
    public void controlElevtor(){
        //  boolean val=true;
        while(true) {
            while (upMinQueue.size() != 0) {
                elevatorCar.movecar(Direction.UP, upMinQueue.poll());
            }
            while (upMinQueue.size() != 0) {
                upMinQueue.offer(elevatorUpQueue.poll());
            }
            while (downMaxQueue.size() != 0) {
                elevatorCar.movecar(Direction.DOWN, downMaxQueue.poll());
            }
            while (elevatorDownQueue.size() != 0) {
                elevatorDownQueue.offer(elevatorDownQueue.poll());
            }
            if(elevatorUpQueue.size()==0&&elevatorDownQueue.size()==0
            &&upMinQueue.size()==0&&downMaxQueue.size()==0){
                break;
            }
        }

    }
}
