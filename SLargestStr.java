import java.util.Scanner;

public class SLargestStr{
    public static void main(String[] args) {
        String s = "dfa12321afd";
        char[] arr = s.toCharArray();
        int largest = -1;
        int slargest = -1;

        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                int num = Character.getNumericValue(arr[i]);
              
                if(num > largest){
                    slargest = largest;
                    largest = num;
                }
                else if(num < largest && num > slargest){
                    slargest = num;
                }
            }
        }
        System.out.println("Slarge is : "+slargest);
    }
}