import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] items = {"Hello", "Kudos", "Bonsi"};
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        ArrayList<String> listItems = new ArrayList();
        listItems.add("Bad");
        listItems.add("Good");
        listItems.add("Angry");
        listItems.add("Gentle");
        
        sort(array);
        System.out.println(Arrays.toString(array));
        sort(items);
        System.out.println(Arrays.toString(items));
        sortIntegers(list);
        System.out.println(list);
        sortStrings(listItems);
        System.out.println(listItems);

        
    }
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
