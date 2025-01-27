public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int maxConsOnes = 0, consCount = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 1){
                maxConsOnes = Math.max(maxConsOnes,consCount);
                consCount = 0;
            }
            else{
                consCount += 1;
            }
        }
        System.out.println("Max Cons Ones : "+maxConsOnes);
    }
}
