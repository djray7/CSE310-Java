// import java.util.Scanner;
import java.util.*;

public class Main {
  List<Integer> food = new ArrayList<Integer>(100);
  List<Integer> clothing = new ArrayList<Integer>(100);
  List<Integer> rent = new ArrayList<Integer>(100);
  List<Integer> gas = new ArrayList<Integer>(100);
  List<Integer> tuition = new ArrayList<Integer>(100);
  public static void main(String[] args) {
    String option;
    System.out.println("Welcome to your budget!");
    System.out.println("");
    Inputs input = new Inputs();
    Display display = new Display();
    // Lists lists = new Lists();
  
    // System.out.println(food);

    do {
      System.out.println("What would you like to do?");
      System.out.println("1) Report Expense");
      System.out.println("2) View Current Spendings");
      System.out.println("3) Exit");

      System.out.println("> ");
      Scanner myObj = new Scanner(System.in);
      option = myObj.nextLine();
      // myObj.close();
      
      if (option.equals("1")) {
        input.input();
        // System.out.println();
        // System.out.println("Hello");
      }
      if (option.equals("2")) {
        display.sum();
      }
    } while (!option.equals("3"));
  }
}
