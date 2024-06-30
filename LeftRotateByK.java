import java.util.Scanner;

public class LeftRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter places to rotate : ");
        int k = sc.nextInt();

        System.out.println("Enter ther length of an arr : ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            System.out.println("Enter arr["+i+"]");
            arr[i] = sc.nextInt();
        }

        rotate(arr, 0, len-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, len-1);
    }

    public static void rotate(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] is : "+arr[i]);
        }
    }
}
