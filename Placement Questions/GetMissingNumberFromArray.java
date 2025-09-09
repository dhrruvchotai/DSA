    public class GetMissingNumberFromArray {
        public static void main(String[] args) {
            int arr[] = {1,2,0,5,4};
            int n = arr.length;
            int sum = (n * (n+1))/2;
            for(int i = 0; i < arr.length; i++){
                sum -= arr[i];
            }
            System.out.println("Missing Number is : "+sum);


            //USING XOR
            int xor1 = 0;
            int xor2 = 0;

            for(int i = 1; i <= n; i++){
                xor1 = xor1 ^ i;
            }

            for(int i = 0; i < n; i++){
                xor2 = xor2 ^ arr[i];
            }

            System.out.println("Missing Number is : "+ (xor1 ^ xor2));
        }   
    }
