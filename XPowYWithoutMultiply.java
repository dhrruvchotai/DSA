public class XPowYWithoutMultiply{
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int ans = xPowY(x,y);
        System.out.println("Ans : "+ans);
    }
    public static int multiply(int a, int b){
        int result = 0;
        for(int i=0;i<b;i++){
            result += a;
        }
        return result;
    }
    public static int xPowY(int x, int y){
        int result = 1;
        for(int i=0;i<y;i++){
            result = multiply(result, x);
        }
        return result;
    }
}