import java.util.*;
public class ABForm{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();
        int i = 0;
        

        Stack<Character> st = new Stack<Character>();

        while(str.charAt(i) != 'b'){
            st.push('a');
            i++;
        }

        while(i<str.length()){   
            if(st.empty()){
                System.out.println("Invalid!");
                break;
            }
                st.pop();
                i++;
        }

        if(st.empty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid!");
        }
    }
}
