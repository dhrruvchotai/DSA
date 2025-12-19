//Leetcode 2110
public class DecendingStockPrice{
    public static void main(String[] args) {
        int nums[] = {3,2,1,4};

        int n = nums.length;
        long count = n;

        for(int i = 0; i < n-1; i++){
            int j = i+1;
            while((j<n) && (nums[j-1] == nums[j]+1)){
                // System.out.println("nums["+i+"] = "+nums[i]+" nums["+j+"] = "+nums[j]);
                count+=1;
                j++;
            }
        }

        System.out.println("Count is : "+count);
    }
}