import java.util.Arrays;

public class FormLargestNumberFromArray {
    public static void main(String[] args) {
        int nums[] = {10,9,2,11};
        String arr[] = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            // becuase here we have int array so this will not work because it is premitive dtype and they do not have method if that was Integer then toString method works
            // arr[i] = nums[i].toString();
            //so write
            arr[i] = String.valueOf(nums[i]);
        }

        //sort array in decending based on maximum value formed after concatination
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));

        //if first element means the largest number is 0 means all are zero soo return zero
        if(arr[0].equals("0")){
            System.out.println("Largest is 0");
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]);
            }
            System.out.println("Largest Number Formed is : "+sb.toString());
        }
    }
}
