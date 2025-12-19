import java.util.ArrayList;
import java.util.List;

//Leetcode 17
public class CombinationOfPhoneNum{
    public static void main(String[] args) {
        String digits = "5678";

        int n = digits.length();
        List<String> ans = new ArrayList<>();
        
        List<String> possibleStr = new ArrayList<>(); //["abc", "def"]
        String possibleChars = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < n; i++){
            int num = (digits.charAt(i)-'0')-2;
            possibleStr.add(possibleChars.substring(num*3,(num*3)+3));
        }

        generateCombinations(possibleStr.size(), possibleStr, ans, "", 0);
        System.out.println(ans);

    }

    public static void generateCombinations(int n, List<String> possibleStr, List<String> ans, String curr, int index){
        if(index == n){
            ans.add(curr);
            return;
        }

        String str = possibleStr.get(index);

        for(int i = 0; i < possibleStr.get(0).length(); i++){
            generateCombinations(n, possibleStr, ans, curr+str.charAt(i), index+1);
        } 
    }
}