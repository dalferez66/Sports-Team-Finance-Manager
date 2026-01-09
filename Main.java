import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Loads CSV data 
        DataManager dm = new DataManager(); 
        ArrayList<Expenses> teamExpenses = dm.loadFromFile();


        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){

            System.out.println("");
            System.out.println("[--Sports Team Finance Tracker--]");
            System.out.println("");

            System.out.println("\n1. Add Expense \n2. View Expenses \n3. Exit");
            System.out.println("Choose an option (e.g. 1): ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            if(choice == 1){
                System.out.println("Enter expense name: ");
                String name = scanner.nextLine();

                System.out.println("Enter expense amount: ");
                double price = scanner.nextDouble();

                System.out.println("Type: 1. Equipment  2. Travel");
                int type = scanner.nextInt();
                scanner.nextLine(); // Clears the buffer

                if (type == 1) {
                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine(); // Clears the buffer
                    teamExpenses.add(new Equipment(name, price, qty));
                } 

                else if (type == 2) {
                    System.out.print("Destination: ");
                    String dest = scanner.nextLine();
                    teamExpenses.add(new Travel(name, price, dest));
                } 

                else {
                    // Fallback if they pick a wrong number
                    teamExpenses.add(new Expenses(name, price, "General"));
                }


                System.out.println("Expense added successfully!");

            }

            else if(choice == 2){
                System.out.println("\n [--Current Team Expenses--]");
                for (Expenses expense : teamExpenses){
                    expense.displayExpense();
                }
            }

            else if(choice == 3){

                dm.saveToFile(teamExpenses);

                isRunning = false;
                System.out.println("Exiting the finance tracker. Goodbye!");
            }

            else{
                System.out.println("Invalid option. Please try again.");
            }
            
        }

        scanner.close();
    }
}
