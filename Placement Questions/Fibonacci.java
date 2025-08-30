public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int terms = 5;

        System.out.print(num1 + " ");
        for(int i = 1; i <= terms; i++){
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
    }
}
