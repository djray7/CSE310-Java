// import java.util.Scanner;
import java.util.List;
import java.util.*;

// list.add(): add to the list
// 
public class Lists {
   
    List<Integer> food = new ArrayList<Integer>(100);
    // int[] food = {};
    List<Integer> clothing = new ArrayList<Integer>(100);
    List<Integer> rent = new ArrayList<Integer>(100);
    List<Integer> gas = new ArrayList<Integer>(100);
    List<Integer> tuition = new ArrayList<Integer>(100);

 
    public static void append(List<Integer> list, int amount){
        list.add(amount);
    }

    public static void delete(List<Integer> list, int amount){
        list.remove(amount);
    }

    public static void show(List<Integer> list){
        System.out.println(list);
    }

    public void pfood(){
        System.out.println(food);
    }

    // public static void sum(List<Integer> list){
    //     // List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    //     int sum = list.stream().mapToInt(Integer::intValue).sum();
    //     System.out.println(sum);    
    // }

}
