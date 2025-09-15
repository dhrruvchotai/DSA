public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {11, 12, 0, 0, 3, 0, 4, 0, 5, 2};
        int nonZeroElementIndex = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroElementIndex] = arr[i];
                nonZeroElementIndex++;
            }
        }
        for(int i = nonZeroElementIndex; i < arr.length; i++){
            arr[i] = 0;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Arr["+i+"] : " + arr[i]);
        }
    }
}
