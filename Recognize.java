import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Recognize {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter String s : ");
        String str = sc.nextLine();
        int n = str.length();

        Stack st = new Stack(n);

        int i = 0;
        
        st.push('c');

        while(str.charAt(i) != 'c'){
            st.push(str.charAt(i));
            i++;
        }

        i+=1;

        while((i < n) && (str.charAt(i) == st.pop())){
            System.out.println(" ");
            System.out.println("Element at "+i+" is same.");
            i++;
        }


    }
}
class Stack{

    Scanner sc = new Scanner(System.in);
    
    int top = -1;
    int n;
    char ch[];
    int i = 0;

    Stack(int n){
        ch = new char[n];
        this.n = n;
    }

    public void push(char c){
        if(top >= (n-1)){
            System.out.println(" ");
            System.out.println("Stack Overflow");
            return;
        }
        top+=1;
        ch[top] = c;
    }

    public void display(){
        
        if(top < 0){
            System.out.println(" ");
            System.out.println("Stack UnderFlow.");
            return;
        }

        for(int i=0;i<=top;i++){
            System.out.println(" ");
            System.out.println("Stack["+i+"] : "+ch[i]);
        }

    }

    public int pop(){
        if(top < 0){
            System.out.println(" ");
            System.out.println("Stack Underflow");
            return 0;
        }

        top = top - 1;
        return ch[top + 1];
        
    }
}