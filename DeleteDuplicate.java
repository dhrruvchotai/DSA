import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,4};
        Set<Integer> set1 = new HashSet<Integer>(); 

   
        for(int i=0;i<arr.length;i++){
            set1.add(arr[i]);
        }

            System.out.println(set1);
        

    }
}
