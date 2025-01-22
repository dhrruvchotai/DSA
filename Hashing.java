public class Hashing { 
    static int hash[] = new int[20];
    public static void main(String[] args) {
        int arr[] = new int[15];

        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 1000);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        for(int i=0;i<arr.length;i++){
            int index = hashFn(arr[i]);
            System.out.print(index+"  ");
            hash[index] = arr[i];
        }

        System.out.println("HASH ARR IS : ");
        for(int i=0;i<hash.length;i++){
            System.out.print(hash[i]+"  ");
        }
    }
    public static int hashFn(int n){
        int index = (n % 18) + 2;

        if(hash[index] != 0){
            
            index = ((n % 18) + 2) + 1;
            
            while (hash[index] != 0) {

            }
        }
        return index;
    }
}
