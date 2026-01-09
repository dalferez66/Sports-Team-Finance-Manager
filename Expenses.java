public class Expenses {

    protected String name;
    protected double amount;
    protected String category;

    public Expenses(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    // This is for the CSV saving 
    public String toCSV() {
        return name + "," + amount + "," + category;
    }

    public void displayExpense() {
        System.out.println("[" + category + "] " + name + ": $" + amount);
    }
}
    