public class Floor {
    int floorno;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorno){
        this.floorno = floorno;
        externalDispatcher = new ExternalDispatcher();
    }
    public void pressButton(Direction direction){
        externalDispatcher.submitRequest(direction, floorno);
    }
}
