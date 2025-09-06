public class ElevatorCar {
    Direction direction;
    int id;
    int currentfloor;
    ElevatorState elevatorState;
    ElevatorDisplay elevatorDisplay;
    InternalButton internalButton;

    ElevatorCar(){
        elevatorDisplay=new ElevatorDisplay();
        internalButton=new InternalButton();
        elevatorState=ElevatorState.IDLE;
        currentfloor=0;
        direction=direction.UP;
    }

    public void showDisplay(){
        elevatorDisplay.showDisplay();
    }
    public void setDisplay(){
        elevatorDisplay.setDisplay(currentfloor,direction);
    }
    public void setInternalButton(int destination){
        internalButton.pressButton(destination,this);
    }
    public boolean movecar(Direction direction,int destination){
        int startfloor=currentfloor;

        if(direction==Direction.UP){
            for(int i=startfloor;i<=destination;i++){
                currentfloor=i;
                if(i==destination){

                    setDisplay();
                    showDisplay();
                    return true;
                }
            }
        }
        else if(direction==Direction.DOWN){
            for(int i=startfloor;i>=destination;i--){
                if(i==destination){
                    setDisplay();
                    showDisplay();
                    return true;
                }
            }
        }
        return false;

    }
}
