import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2{
    // This is just a helper function to help with timing
    // As well as allowing a single input n
    // It takes n and returns all permutations of a range from 1 to n
    static void findAllPermutations(int n) { 
        long time1 = System.currentTimeMillis();
        permutation(makeRange(n), 0);
        long time2 = System.currentTimeMillis();
        System.out.println("Time Elapsed: " + (time2 - time1));
    }
    
    // returns all permutations of a given array 
    // y is a value to help with recursion
    // when you call it should always start as 0
    static void permutation(List<Integer> array, int y) {

        // Recusrive function
        // If y < array.size() it will continue to loop
        // it recursively works its way through the list and swaps two elements each time, based on i and y

        // Example:

        // permutation((1,2,3), 0) will first check to see if y is equal to array.size()-1
        // it is not so it continues without printing.
        // It then starts a loop where i = 0 & y = 0
        // it swaps index 0 with index 0
        // it then calls permutation((1,2,3), 1)
        // It then starts a loop where i = 1 & y = 1
        // it swaps index 1 with index 1
        // .  .  .  .  .  .  .  .
        // Continue down the line, things start swapping after the 
        // first loop as i is not the same as y



        if (y == array.size() -1) {
            System.out.println(Arrays.toString(array.toArray()));
        }
        for(int i = y; i < array.size(); i++) {
            swap(array, i, y);       // Swaps 
            permutation(array, y+1); // Recursive Step
            swap(array, i, y);       // Swaps
        }
    }

    // This is just a function that takes an array and two indeces and swaps the values at
    // said indeces
    public static List<Integer> swap(List<Integer> array, int index1, int index2) {
        int temp = array.get(index1);        // Set temp variable to value of index1
        array.set(index1, array.get(index2));// Set value of index1 to value of index2
        array.set(index2, temp);             // Set value of index2 to value of index1 (temp)
        return array;                        // Return array w/ swapped elements
    }
    
    // Make a list of numbers rangin from 1 to n
    public static List<Integer> makeRange(int n) {
        List<Integer> array = new ArrayList<Integer>();
        for(int i = n; i > 0; i--) {
            array.add(0, i);
        }
        return array;
    }

    public static void main(String[] args){
        // 0 Case
        findAllPermutations(0); 
        // 1 Case
        findAllPermutations(1); 
        // 2 Case
        findAllPermutations(2); 
        // 3 Case
        findAllPermutations(3); 
        // 4 Case
        findAllPermutations(4); 
        // 5 Case
        findAllPermutations(5); 
        
        
    }
}
