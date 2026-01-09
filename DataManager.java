//For saving data to CSV file
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//For loading data form CSV file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class DataManager {
    private String fileName = "team_expenses.csv";

    public void saveToFile(ArrayList<Expenses> expenses) {
        // 'try-with-resources' automatically closes the file for you!
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            
            //CSV Header
            writer.println("Name,Amount,Category");

            for (Expenses e : expenses) {
                writer.println(e.toCSV());
            }
            System.out.println("[UPDATE] Data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("[ERROR] Trouble saving to file: " + e.getMessage());
        }
    }



    public ArrayList<Expenses> loadFromFile() {
    ArrayList<Expenses> loadedExpenses = new ArrayList<>();
    File file = new File(fileName);

    // Check if the file exits
    if (!file.exists()) {
        return loadedExpenses; 
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        reader.readLine(); // Skip the header line (Name, Amount, Category)

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                String name = data[0];
                double amount = Double.parseDouble(data[1]);
                String category = data[2];

                // Create the object and add it to the list
                loadedExpenses.add(new Expenses(name, amount, category));
            }
        }
        System.out.println("📥 Loaded previous data from " + fileName);
    } catch (IOException e) {
        System.out.println("⚠️ Could not load data: " + e.getMessage());
    }
    return loadedExpenses;
}
}


