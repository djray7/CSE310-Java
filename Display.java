import java.util.*;
// import java.util.Scanner;

public class Display extends Inputs {
    public void sum(){

        System.out.println("");
        System.out.println("Which expense summary would you like to see? ");
        System.out.println("- Food ");
        System.out.println("- Gas ");
        System.out.println("- Clothing ");
        System.out.println("- Rent ");
        System.out.println("- Tuition ");
        System.out.println("- All ");

        Scanner obj = new Scanner(System.in);
        String category = obj.nextLine();
        // obj.close();
        
        System.out.println("");

        int sfood = food.stream().mapToInt(Integer::intValue).sum();
        int sgas = gas.stream().mapToInt(Integer::intValue).sum();
        int sclothing = clothing.stream().mapToInt(Integer::intValue).sum();
        int srent = rent.stream().mapToInt(Integer::intValue).sum();
        int stuition = tuition.stream().mapToInt(Integer::intValue).sum();
        int sall = sfood + sgas + sclothing + srent + stuition;

        if (category.equals("Food") || category.equals("food")){
            // Display summary of list
            // System.out.println(food);
            System.out.println("You have spent $" + sfood + " on food.");        // 15
        }
        if (category.equals("Gas") || category.equals("gas")){
            System.out.println("You have spent $" + sclothing + " on gas.");  
        }
        if (category.equals("Clothing") || category.equals("clothing")){
            System.out.println("You have spent $" + sclothing + " on clothing."); 
        }
        if (category.equals("Rent") || category.equals("rent")){
            System.out.println("You have spent $" + srent + " on rent.");  
        }
        if (category.equals("Tuition") || category.equals("tuition")){
            System.out.println("You have spent $" + stuition + " on tuition.");   
        }
        if (category.equals("All") || category.equals("all")){
            System.out.println("Your total expenses are $" + sall);   
        }

        System.out.println("");
    }
}
