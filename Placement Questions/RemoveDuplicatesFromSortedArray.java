import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 3, 3, 5, 6, 11, 11, 12};

        int newLength = removeDuplicatesFromSortedArray(arr);

        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    public static int removeDuplicatesFromSortedArray(int[] arr){
        //because first single element always be unique
        int nonDuplicateNumIndex = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[nonDuplicateNumIndex] = arr[i];
                nonDuplicateNumIndex++;
            }
        }

        //return new array or say index till which there is non duplicate elements in the original array after this
        return nonDuplicateNumIndex;
    }

    
}
