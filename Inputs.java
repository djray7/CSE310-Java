// Handles the option to add an expense 
// import java.util.Scanner;
import java.util.*;
// import java.FinancialTracker.Lists;

public class Inputs extends Main {
    // Lists list = new Lists();

    public void input() { 
        // asks for which expense
        System.out.println("");
        System.out.println("Which expense would you like to report? ");
        System.out.println("- Food ");
        System.out.println("- Gas ");
        System.out.println("- Clothing ");
        System.out.println("- Rent ");
        System.out.println("- Tuition ");
        Scanner obj = new Scanner(System.in);
        String category = obj.nextLine();
        // obj.close();
         
        // int amount = newObj.nextLine();
 
        // add(category, amount);
        if (category.equals("Food") || category.equals("food")){
            // Retrieve the food list from the List class
            // Add the amount to that list
            int amount = get_cost();
            food.add(amount);
            System.out.println(food);
            // System.out.println("fod");
        }
        else if (category.equals("Gas") || category.equals("gas")){
            int amount = get_cost();
            gas.add(amount);
        }
        else if (category.equals("Clothing") || category.equals("clothing")){
            int amount = get_cost();
            clothing.add(amount);
        }
        else if (category.equals("Rent") || category.equals("rent")){
            int amount = get_cost();
            rent.add(amount);
        }
        else if (category.equals("Tuition") || category.equals("tuition")){
            int amount = get_cost();
            tuition.add(amount);
        }
        else {
            System.out.println("An error ocurred in adding your expense. Please try again.");
        }

        System.out.println("");
    }

    public int get_cost(){
        System.out.println("Amount($): ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        // scan.close();
        return amount;
    }
}

    