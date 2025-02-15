import java.util.Scanner;

// 1. Brute force approach
// public class MaxConsecutiveOne{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
    
//         int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
//         int maxLen = 0;
//         int n = arr.length;
//         System.out.println("Enter the value of k : ");
//         int k = sc.nextInt();

//         for(int i=0;i<n;i++){
//             int zerosCount = 0;
//             for(int j=i;j<n;j++){
//                 if(arr[j] == 0) zerosCount++;

//                 if(zerosCount <= k){
//                     int len = j - i + 1;
//                     maxLen = Math.max(len,maxLen);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }

//         System.out.println("Max consecutive ones are : "+maxLen);
//     }
// }


public class MaxConsecutiveOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int maxLen = 0,l = 0, r =0,zerosCount = 0;

        while(r < arr.length){
            if(arr[r] == 0) zerosCount++;

            if(zerosCount <= k){
                int len = r - l + 1;
                maxLen = Math.max(len,maxLen);
            }
            else{
                while(zerosCount > k){
                    if(arr[l] == 0) zerosCount--;
                    l++;
                }
            }
            r++;
        }
        System.out.println("The max cons ones : "+maxLen);
    }
}