import java.util.Arrays;
import java.util.Scanner;
public class Hashingch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = null;
        System.out.println("Enter the string : ");
        s = sc.nextLine();

        int[] arr = new int[26];
        Arrays.fill(arr,0);

        for(int i=0;i<s.length();i++){
            int num = (int)(s.charAt(i));
            int index = num-97;
            arr[index]+=1;
        }

        System.out.println("Enter how many char want to find : :");
        int m = sc.nextInt();

        for(int j=0;j<m;j++){
            String charr = null;
            charr = sc.next();
            char asci = charr.charAt(0);
            int indx = (((int)(asci)) - 97);

            System.out.println(indx);
            System.out.println(asci+" occurs "+arr[indx]+" times ");
            
        }

    }
}
