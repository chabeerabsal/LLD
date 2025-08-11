
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String,Items> inventory = new HashMap<>();

    public void addItems(Items item){
        inventory.put(item.getCode(), item);
    }

    public Items selectedItem(String code){
        if(inventory.containsKey(code)){
            return inventory.get(code);
        }
        return null;
    }



}
