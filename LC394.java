import java.util.Stack;
public class LC394 {
    public static void main(String[] args) {
        String str = "3[a2[c]]";
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int index = 0;

        while(index < str.length()){
            if(Character.isDigit(str.charAt(index))){
                numStack.push(Integer.parseInt(str.charAt(index) + ""));
            }
            else if(Character.isLetter(str.charAt(index)) || (str.charAt(index) + "") == "]"){
                stringStack.push(str.charAt(index) + " ");
            }
            index++;
        }

        System.out.println(stringStack);

    }
}
