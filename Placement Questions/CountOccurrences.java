import java.util.HashMap;
import java.util.Map;

public class CountOccurrences{
    public static void main(String[] args) {
        int[] arr = {11, 12, 0, 0, 12, 0, 11, 0, 5, 5, 3, 1};
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            count.put(arr[i], count.getOrDefault(arr[i], 0)+1);        
        }

        //this will also work
        // System.out.println("Count of each element is : "+count);
        for(Map.Entry entry : count.entrySet()){
            System.out.println("Count of "+entry.getKey()+ " is : "+entry.getValue());
        }
    }   
}
