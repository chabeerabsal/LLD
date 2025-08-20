//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Inventory inventory = new Inventory();
        Items items = new Items("chocalte",4,10,"A1");
        Items items2 = new Items("Lays",4,10,"A2");
        Items items3 = new Items("Biscuits",4,10,"A3");
        Items items4 = new Items("Cake",4,10,"A4");
        inventory.addItems(items);
        inventory.addItems(items2);
        inventory.addItems(items3);
        inventory.addItems(items4);
        VendingMachine vendingMachine=new VendingMachine(inventory);
        vendingMachine.selectedItems("A4",20,2);


    }
}