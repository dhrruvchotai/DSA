public class PrintFibonacciInReverse {
    public static void main(String[] args) {
        int num = 8;
        //Recursive
        // printReverseFibonacci(num);

        //Iterative
        int fibTerms[] = new int[num];
        fibTerms[0] = 0;
        if(num > 0) fibTerms[1] = 1;
        
        for(int i = 2; i < fibTerms.length; i++){
            fibTerms[i] = fibTerms[i-1] + fibTerms[i-2];
        }

        for(int i = fibTerms.length-1; i >= 0; i--){
            System.out.print(fibTerms[i] + " ");
        }
    }

    public static int getNthTermOfFib(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        return getNthTermOfFib(num-1) + getNthTermOfFib(num-2);
    }
    public static void printReverseFibonacci(int num){
        if(num < 0) return;
        int val = getNthTermOfFib(num);
        System.out.print(val + " ");
        printReverseFibonacci(num);
    }
}
