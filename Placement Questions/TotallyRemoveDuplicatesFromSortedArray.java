import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TotallyRemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 3, 3, 5, 6, 11, 11, 12};   
        System.out.println("Totally Unique elements which occur only once are : "+totallyRemoveDuplicates(arr));
    }

    public static ArrayList<Integer> totallyRemoveDuplicates(int arr[]){
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : arr){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        ArrayList<Integer> uniqueOnceList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                uniqueOnceList.add(entry.getKey());
            }
        }

        return uniqueOnceList;
    }
}
