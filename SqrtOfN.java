public class SqrtOfN {
    public static void main(String[] args) {
        int n = 8;
        int left = 0;
        int right = n;
        int ans = 0;
        if (n == 0 || n == 1) {
            System.out.println("sqrt of " + n + " is " + n);
        }

        while(left <= right){
            int mid = (left+right)/2;
            if(mid*mid == n){
               ans = mid;
               break;
            }
            else if(mid*mid < n){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Sqrt is : "+ans);
    }
}
