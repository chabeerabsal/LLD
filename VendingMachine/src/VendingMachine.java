public class VendingMachine {
    private Inventory inventory;
    private String selectedItem;
    private PaymentService paymentService;
    private int cash;

    VendingMachine(Inventory inventory)
    {
        this.inventory = inventory;
    }

    VendingMachine(String selectedItem,int cash)
    {
        this.selectedItem = selectedItem;
        this.cash = cash;
        this.paymentService = new PaymentService();
    }

    public void selectedItems(String code,int cash,int quantity)
    {
        Items items=inventory.selectedItem(code);
        if(items==null)
        {
            System.out.println("Items not found");
        }
        else if(items.getQuantity()<quantity){
            System.out.println("Not enough items please try again");

    }
        else{
            int originalCash=items.getPrice();
            int originalQuantity=items.getQuantity();
            items.setQuantity(originalQuantity-quantity);
            //paymentService=

        }
    }
}
