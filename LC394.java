import java.util.Stack;
public class LC394 {
    public static void main(String[] args) {
        String str = "3[a2[c]]";
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentStr = "";

         int multiplier = 0;
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                // multiplier = ch - '0';//works for only single digit
                multiplier = multiplier*10 + (ch - '0');//for this case 100[Dhruv]
                //  we have to use this
            }
            else if(ch == '['){
                numStack.push(multiplier);
                stringStack.push(currentStr);
                multiplier = 0;
                currentStr = "";
            }
            else if(ch == ']'){
                int repeat = numStack.pop();
                String previous = stringStack.pop();
                currentStr = previous + currentStr.repeat(repeat);
            }
            else{
                currentStr += ch;
            }
        }

        System.out.println(currentStr);
    }
}
