import java.util.Scanner;

public class StackMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        Stack1 st = new Stack1();
        
        int choice;

        System.out.println(" ");
        System.out.print("Enter 0 for nothing and 1 for some operations : ");
        choice = sc.nextInt();

        while(choice == 1){

            System.out.println(" ");
            System.out.print(" Enter \n 2 -> push \n 3 -> pop \n 4 -> peep \n 5 -> change \n 6 -> display \n Enter :  ");
            int call = sc.nextInt();

            if(call == 2){
                System.out.println(" ");
                System.out.print("Enter an element to push : ");
                int n = sc.nextInt();
                st.push(n);
            }

            else if(call == 3){
               System.out.println(" ");
               int ans =  st.pop();
               System.out.println("Your Last Element was : "+ans);
            }

            else if(call == 4){
                System.out.println(" ");
                System.out.print("Enter elmt from top to peep from : ");
                int elmtfromtop = sc.nextInt();

                int ans = st.peep(elmtfromtop);

                if(ans != 0){
                    System.out.println(" ");
                    System.out.println("Elemnt "+elmtfromtop+" from top is : "+ans);
                }

            }

            else if(call == 5){
                System.out.println(" ");
                System.out.println("Enter elmt from top to change value : ");
                int elmtfromtop = sc.nextInt();

                System.out.println(" ");
                System.out.println("Enter new value of it : ");
                int newelmt = sc.nextInt();

                st.change(newelmt, elmtfromtop);
            }


            else if(call == 6){
                st.display();
            }

            System.out.println(" ");
            System.out.print("Enter 0 for nothing and 1 for some operations :");
            choice = sc.nextInt();

        }
    }
}
class Stack1{

    Scanner sc = new Scanner(System.in);

    int top = -1;
    int n;
    int s[];

    Stack1(){
            System.out.println("Enter size of an array : ");
             n = sc.nextInt();
             s = new int[n];
    }

    public void display(){
        
        if(top < 0){
            System.out.println(" ");
            System.out.println("Stack UnderFlow.");
            return;
        }

        for(int i=0;i<=top;i++){
            System.out.println(" ");
            System.out.println("Stack["+i+"] : "+s[i]);
        }

    }
    public void push(int x){

        if(top >= (n-1)){
            System.out.println(" ");
            System.out.println("Stack Overflow.");
        }
        else{
            top+=1;
            s[top] = x;

        }

    }

    public int pop(){
        if(top < 0){
            System.out.println(" ");
            System.out.println("Stack Underflow");
            return 0;
        }

        top = top - 1;
        return s[top + 1];
        
    }

    public int peep(int elmtfromtop){
        if((top - elmtfromtop + 1) < 0){
            System.out.println(" ");
            System.out.println("Stack Underflow.");
            return 0;
        }
        
        return s[top - elmtfromtop + 1];
    }   

    public void change(int newelmt,int elmtfromtop){
        if((top - elmtfromtop + 1) < 0){
            System.out.println(" ");
            System.out.println("Stack Underflow.");
            return;
        }
        s[top - elmtfromtop + 1] = newelmt;
    }
}