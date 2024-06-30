import java.util.Arrays;
import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array you want to give: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        Arrays.fill(arr, 0);
       
        for(int i=0;i<n;i++){
        System.out.println("Enter "+i +"=");
           arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        Arrays.fill(hash, 0);
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }

        
        System.out.println("Enter how many num uh want to find : :");
        int m = sc.nextInt();

        for(int j=0;j<m;j++){
            int num = 0;
            num = sc.nextInt();
            System.out.println(hash[num]);
            
        }

    }
}
