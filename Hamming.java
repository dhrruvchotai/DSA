import java.util.Scanner;

public class Hamming{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int hammingDis = 0;
    

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int n = a^b;
        System.out.println("N is : "+n);

        while(n != 0){
            System.out.println(n & 1);
            if((n&1) == 1){
                hammingDis += 1;
            }
            n = n >> 1;
        }

       System.out.println("The Hamming Distance Is : "+hammingDis);

    }
}