import java.util.Arrays;

public class RemoveDups{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4};

        int[] ans = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(ans));
    }
}