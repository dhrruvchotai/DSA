public class FindSecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {11, 13, 0, 0, 3, 0, 4, 0, 5, 2, 12};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > slargest && arr[i] < largest){
                slargest = arr[i];
            }
        }

        System.out.println("Largest : "+largest+" Second Largest : "+slargest);
    }   
}
