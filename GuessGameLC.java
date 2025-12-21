public class GuessGameLC{

    public static void main(String[] args) {
        System.out.println("Guessed num was = "+guessNumber(10));
    }
    public static int guessNumber(int n) {
        int low = 1;
        int high = n;

        int mid = (low + high)/2;
        int guess = guess(mid);
        // System.out.println("Mid = "+mid);
        // System.out.println("First guess "+guess);
        while(guess != 0){
            if(guess == -1){
                high = mid-1;
            }
            else if(guess == 1){
                low = mid+1;
            }
            mid = (low+high)/2;
            guess = guess(mid);
        }

        return mid;
    }

    public static int guess(int num){
        int guessNum = 6;
        if(num > guessNum) return -1;
        if(num < guessNum) return 1;
        return 0;
    }

}