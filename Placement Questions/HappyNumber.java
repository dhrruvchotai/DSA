public class HappyNumber {
    public static void main(String[] args) {
        int num = 20;
        int originalNum = 20;
        while (num != 1 && num != 4) {
            num = getSumOfSquareOfDigits(num);
        }
        System.out.println("Num " + originalNum + " is " + (num == 1 ? "Happy" : "Not Happy"));

    }

    static int getSumOfSquareOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += Math.pow(num % 10, 2);
            num /= 10;
        }
        return sum;
    }
}