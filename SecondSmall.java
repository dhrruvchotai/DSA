public class SecondSmall {
    public static void main(String[] args) {
            int arr[] = {1,2,3,8,3,6};
            int smallest = arr[0];
            int ssmallest = Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i] < smallest){
                    ssmallest = smallest;
                    smallest = arr[i];
                }
                else if((arr[i] > smallest) && (arr[i] < ssmallest)){
                    ssmallest = arr[i];
                }
            }
            System.out.println("Second smallest is : "+ssmallest);
        }
    }
