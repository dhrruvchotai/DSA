public class RevArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5}; 
        int st = 0;
        int lt = (arr.length - 1);

        ForRev fr = new ForRev();
        int arr1[] = fr.reverse(arr, st, lt);
        
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr[i]);
        }
    

    }
}
class ForRev{
    public int[] reverse(int arr[],int st,int lt){
        

        if(st<lt){
            int temp = 0;
            temp = arr[st];
            arr[st] = arr[lt];
            arr[lt] = temp;
            st++;
            lt--;
            reverse(arr,st, lt);
        }
        return arr;
       
    }
}