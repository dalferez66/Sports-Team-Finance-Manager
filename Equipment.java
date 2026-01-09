public class Equipment extends Expenses {
    private int quantity;

    public Equipment(String name, double amount, int quantity) {
        // 'super' calls the Expense constructor
        super(name, amount, "Equipment"); 
        this.quantity = quantity;
    }

    // Overriding the display to show quantity
    @Override
    public void displayExpense() {
        System.out.println("[Equipment] " + name + " (Qty: " + quantity + "): $" + amount);
    }
}