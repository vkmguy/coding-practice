import java.util.HashSet;
import java.util.Set;

public class CyclicArray {

    public static boolean doesContainCycle(int[] arr, int start_ind, Set<Integer> v) {

        if (start_ind < 0){
            start_ind = start_ind % arr.length;
            start_ind = arr.length + start_ind;
        }
        //base case
        if (v.size() == arr.length)
           return start_ind == 0;

        v.add(start_ind);
        int next_index = (start_ind + arr[start_ind]) % arr.length;

        if (!v.contains(next_index)){
            return doesContainCycle(arr, next_index, v);
        }
        return false;
    }

    public static boolean checkCycle(int[] arr){
        Set<Integer> visited = new HashSet<>();
        return doesContainCycle(arr,0, visited);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, -4, -4, 2};
        boolean result = checkCycle(arr);
        System.out.println(result);
    }
}
