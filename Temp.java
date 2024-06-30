public class Temp{
    public static void main(String[] args) {
       int num = 38;
       int sum = 0;
       int rem = 0;
       int tempSum = 0;
       
       while(num > 0){
        rem = num % 10;
        sum+=rem;
        num/=10;
       }
       System.out.println("Sum is  : "+sum);
       tempSum = sum;
       rem = 0;
    

       while(tempSum > 0){
        rem = tempSum % 10;
        sum+=rem;
        tempSum/=10;
       }
       System.out.println(tempSum);

    }
}