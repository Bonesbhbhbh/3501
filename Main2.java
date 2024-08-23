import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2{

    static void findAllPermutations(int n) {
        long time1 = System.currentTimeMillis();
        permutation(makeRange(n), 0);
        long time2 = System.currentTimeMillis();
        System.out.println("Time Elapsed: " + (time2 - time1));
    }
    
    static void permutation(List<Integer> array, int y) {
        for(int i = y; i < array.size(); i++) {
            swap(array, i, y);
            permutation(array, y+1);
            swap(array, y, i);
        }
        if (y == array.size() -1) {
            System.out.println(Arrays.toString(array.toArray()));
        }
    }

    public static List<Integer> swap(List<Integer> array, int index1, int index2) {
        int temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
        return array;
    }

    public static List<Integer> makeRange(int n) {
        List<Integer> array = new ArrayList<Integer>();
        for(int i = n; i > 0; i--) {
            array.add(0, i);
        }
        return array;
    }

    public static void main(String[] args){
        // 0 Case
        // findAllPermutations(0); 
        // 1 Case
        // findAllPermutations(1); 
        // 2 Case
        // findAllPermutations(2); 
        // 3 Case
        findAllPermutations(3); 
        // 4 Case
        // findAllPermutations(4); 
    }
}
