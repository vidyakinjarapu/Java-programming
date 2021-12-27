import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 2};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index: " + indexOfSmallest(array));
        System.out.println("Smallestfrom" + MainProgram.indexOfSmallestFrom(array, 2));
        
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int smallest(int[] array){
        if(array.length == 1){
            return array[0];
        } else {
            int small = array[0];
            for(int i = 1; i < array.length - 1; i++ ){
                if(array[i] <= small){
                    small = array[i];
                }
            }
            return small;
        }
    }
    
    public static int indexOfSmallest(int[] array){
        int small = smallest(array);
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(small == array[i]){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int index = 0;
        for(int i = startIndex; i < table.length; i++ ){
            if(table[i] <= small){
                small = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int ref = array[index1];
        array[index1] = array[index2];
        array[index2] = ref;
        //printing
//        for(int ele: array){
//            System.out.println(ele);
//        }
    }
    
    public static void sort(int[] array){
        
    }
}