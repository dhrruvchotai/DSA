public class MaximizeDist{
    public static void main(String[] args) {
        int seats[] = {1,0,0,0,1,0,1};
        int maxDist = 0;
        int l = 0;
        int r = 1;
        while(r < seats.length){
            if(seats[r] == 1){
                if((r-l) > maxDist){
                    maxDist = (r-l);
                }
                l = r;
            }
            r++;
        }
        if(r == seats.length && maxDist == 0){
            System.out.println("Index where bob can seat "+(r-1));
        }

       System.out.println("Max ceil = "+Math.ceil((double)maxDist/2));
        System.out.println("Max floor = "+Math.floor((double)maxDist/2));
    }
}


// class Solution {
//     public int maxDistToClosest(int[] seats) {
//         int n = seats.length;
//         int maxDist = 0;

//         int l = -1; // last seen 1

//         for (int r = 0; r < n; r++) {
//             if (seats[r] == 1) {
//                 if (l == -1) {
//                     // leading zeros
//                     maxDist = r;
//                 } else {
//                     // middle zeros
//                     maxDist = Math.max(maxDist, (r - l) / 2);
//                 }
//                 l = r;
//             }
//         }

//         // trailing zeros
//         if (l != -1) {
//             maxDist = Math.max(maxDist, n - 1 - l);
//         }

//         return maxDist;
//     }
// }
