import java.util.ArrayList;

public class ZigZagConversionLC {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int ptr = 0, i = 0, j = 0, rows = 4;
        ArrayList<ArrayList<Character>> ans = new ArrayList<ArrayList<Character>>();

        for(int k = 0; k < rows; k++){
            ans.add(new ArrayList<Character>());
        }

         ArrayList<Character> col = new ArrayList<Character>();
        while(i < rows){
            col.add(str.charAt(i));
            i++;
        }
        ans.add(col);
        i = rows - 2;
        col = new ArrayList<Character>();
        while(i >= 1){
            col.add(str.charAt(i));
        }
        ans.add(col);

        System.out.println(ans);

    }
}
