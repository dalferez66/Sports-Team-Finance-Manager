public class Travel extends Expenses {
    private String destination;

    public Travel(String name, double amount, String destination) {
        super(name, amount, "Travel");
        this.destination = destination;
    }

    @Override
    public void displayExpense() {
        System.out.println("[Travel] " + name + " to " + destination + ": $" + amount);
    }
}
