import java.util.HashSet;

public class HappyNum {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(num + " is " + (isHappy2(num) ? "Happy Number" : " Not Happy Number"));
    }

    public static int getSumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += ((n % 10 )* (n % 10));
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int num) {
        HashSet<Integer> seenElements = new HashSet<>();
        while (num != 1 && !seenElements.contains(num)) {
            seenElements.add(num);
            num = getSumOfSquaresOfDigits(num);
        }
        return num == 1;
    }
        // In Happy Number theory, if a number is not happy,
        // it will always eventually fall into a repeating cycle:
        // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → ...
     public static boolean isHappy2(int num) {
        while (num != 1 && num != 4) {
            num = getSumOfSquaresOfDigits(num);
        }
        return num == 1;
    }
}
