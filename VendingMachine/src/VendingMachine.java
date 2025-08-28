public class VendingMachine {
    private Inventory inventory;
    private String selectedItem;
    private PaymentService paymentService;
    private int cash;
    VendingMachine()
    {
        this.paymentService = new PaymentService();
    }

    VendingMachine(Inventory inventory)
    {
        this.inventory = inventory;
        this.paymentService = new PaymentService();
    }

    VendingMachine(String selectedItem,int cash)
    {
        this.selectedItem = selectedItem;
        this.cash = cash;

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
            int totalmoney=originalCash*quantity;
            items.setQuantity(originalQuantity-quantity);
           int vl= paymentService.cashCalucluation(cash,quantity,totalmoney);
           if(vl>0){
               System.out.println("Vending machine has been successfully called");
           }
           else{

               System.out.println("Not enough items please try again");
           }

        }
    }
}
