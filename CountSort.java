public class CountSort {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1,3,2,3,4,1,6,4,3};
        Solution s = new Solution();
        int ans[] = s.countSort(arr, arr.length);

        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("]");

    }
}

class Solution{

    public int[] countSort(int[] arr,int n){

        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
        }

        int count[] = new int[max+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }


        int output[] = new int[n];

        for(int i=n-1;i>=0;i--){
            output[--(count[arr[i]])] = arr[i];
        }

        return output;
    }
}
