public class SecondLarge{
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        int largest = arr[0];
        int slargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if((arr[i] < largest) && (arr[i] > slargest)){
                slargest = arr[i];
            }
        }
        System.out.println("Second largest is : "+slargest);
    }
}