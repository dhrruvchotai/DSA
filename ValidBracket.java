import java.util.Scanner;
import java.util.Stack;

public class ValidBracket {
    public static void main(String[] args) {

        Stack<Character> st = new Stack<Character>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();
        int i = 0;
        
        
        while(i < str.length()){

            char c = str.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }

            else if(c == ')' && (!st.empty())){
                if(st.peek() != '('){
                    System.out.println("String Invalid");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(c == ']' && (!st.empty())){
                if(st.peek() != '['){
                    System.out.println("String Invalid");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(c == '}' && (!st.empty())){
                if(st.peek() != '{'){
                    System.out.println("String Invalid");
                    return;
                }
                else{
                    st.pop();
                }
            }
            else{
                System.out.println("Invalid!!");  
                return;
            }
            i++;
        }       
        if(st.empty()) System.out.println("Valid!");
        else System.out.println("Invalid");
    }
}
