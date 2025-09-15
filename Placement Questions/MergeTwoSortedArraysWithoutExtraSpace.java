import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1,3,5};
        int arr2[] = {2,4};
        int i = arr1.length - 1, j = 0;


        while(i >= 0 && j < arr2.length){
            if(arr1[i] > arr2[j]){  
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(i = 0; i < arr1.length; i++){
            System.out.println("arr1["+i+"] : "+ arr1[i]);
        }
        for(j = 0; j < arr2.length; j++){
            System.out.println("arr2["+j+"] : "+ arr2[j]);
        }
    }
}
