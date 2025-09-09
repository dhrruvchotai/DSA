public class FindMissingAndRepeatingNumberInArray{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        int sumOfArrElements = 0;
        int sumOfSquareOfArrElements = 0;
        int n = arr.length;
        int sumOfNNaturalNNaturalNums = (n * (n+1))/2;
        int sumOfSquareOfNNaturalNums = (n * (n+1) * (2*n + 1)) / 6;
        
        
        for(int i = 0; i < n; i++){
            sumOfArrElements += arr[i];
            sumOfSquareOfArrElements += Math.pow(arr[i], 2);
        }

        // x - y
        //repeating - missing
        int val1 = sumOfArrElements - sumOfNNaturalNNaturalNums; //(x-y)
        int val2 = sumOfSquareOfArrElements - sumOfSquareOfNNaturalNums; //(x^2 - y^2)
        
        //(x-y) = val1 equation 1
        //(x^2 - y^2) = val2;
        //(x+y)(x-y) = val2;
        //(x+y) = val2 / val1;
        //equation2 (x+y) = val2/val1 (someNum)


        // (x-y) = something
        // (x+y) = something
        // 2x = val1 + val2 / val1;
        // so we get x value now
        // x - y = val1;
        // so y = x - val1;

        int repeatingNumX = ((val1 + (val2/val1)) / 2);
        int missingNumY = repeatingNumX - val1;
        System.out.println("Repeating Number is : " + repeatingNumX + " Missing Number is : "+missingNumY);

    }
}