import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,2};
        int arr2[] = {4,3,5,2,2};


        //without duplicates
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : arr1){
            st.add(num);
        }

        for(int num : arr2){
            if(st.contains(num)){
                result.add(num);
            }
        }

        System.out.println("Without Duplicates : "+result);


        //with duplicates
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int num : arr1){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        for(int num : arr2){
            if(mp.containsKey(num) && mp.get(num) > 0){
                ans.add(num);
                mp.put(num, mp.get(num) - 1);
            }
        }

        System.out.println("With Duplicates : "+ans);
    }
}
