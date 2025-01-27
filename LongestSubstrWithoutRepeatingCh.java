public class LongestSubstrWithoutRepeatingCh {
    // public static void main(String[] args) {
        
    //     String str = "abcabcbb";
    //     int maxLen = 0;

    //     for(int i=0;i<str.length();i++){
    //         int hash[] = new int[256];
    //         for(int j=i;j<str.length();j++){
    //             if(hash[((int)str.charAt(j))] == 1){
    //                 break;
    //             }
    //             int length = j-i+1;
    //             maxLen = Math.max(maxLen, length);
    //             hash[((int)str.charAt(j))] = 1;
    //         }
    //     }
    //     System.out.println("max length of non repeating substring is : "+maxLen);
    // }

    public static void main(String[] args) {
            
        String str = "abcabcbb";
        int maxLen = 0, l = 0, r = 0;

        int hash[] = new int[256];

        for(int i=0;i<hash.length;i++){
            hash[i] = -1;
        }

        while(r < str.length()){
            if(hash[(int)str.charAt(r)] != -1){
                if(hash[(int)str.charAt(r)] >= l){
                    l = hash[(int)str.charAt(r)] + 1;
                }
            }
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[(int)str.charAt(r)] = r;
            r++;
        }
        System.out.println("Maxlen of non repeating substr is "+maxLen);
    }
}
