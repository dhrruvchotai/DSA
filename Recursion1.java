public class Recursion1 {
   public static void main(String[] args) {
    int i =1;
    int n = 5;
   ForFunc fc = new ForFunc();
   int ans = fc.function(i, n);
   System.out.println(ans);

   ForFact ff = new ForFact();
   int ans1 = ff.factorial(i, n);
   System.out.println(ans1);


   }
}
class ForFunc{
    int sum = 0;
    public int function(int i,int n){
       
        if(i<=n){
            sum = sum + i;
            function(i=i+1, n);
            
        }
        return sum;
    }
  
}

class ForFact{
    int fact = 1;
    public int factorial(int i,int n){
       
        if(i<=n){
            fact = fact * i;
            factorial(i=i+1, n);
            
        }
        return fact;
    }
  
}
