public class SwapAlternate{
    public static void main(String[] args){

       int OddArr[]= new int[]{1,2,3,4,5};
       int EvenArr[]= new int[]{1,2,3,4,5,6};


       OddArray oa = new OddArray();
       oa.swapOddArray(OddArr);

       EvenArray ea = new EvenArray();
       ea.swapEvenArray(EvenArr);


    }
}
class OddArray{
    public void swapOddArray(int arr[]){
        for(int i=0;i<=(arr.length -2);i+=2){
          int temp;
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Odd Array : "+arr[i]);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}

class EvenArray{
    public void swapEvenArray(int arr[]){
        for(int i=0;i<(arr.length);i+=2){
          int temp;
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Even Array : "+arr[i]);
            System.out.println(" ");

        }
    }
}