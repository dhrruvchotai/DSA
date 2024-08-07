public class DynamicStack {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    int length = 0;
    

    public void push(int data){ 

        length++;


        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
            return;
        }
        
        newNode.next = top;
        top = newNode;

    }

    
    public void display(){
        Node currentNode = top;
        while(currentNode != null){
            System.out.println(" ");
            System.out.println("Data of Current Node is : "+currentNode.data);
            currentNode = currentNode.next;
        }

        
    }

    public int pop(){

        length--;

        if(top == null){
            System.out.println("Stack Underflow!!");
            return 0;
        }
        int poppedElmt = top.data;
        top = top.next;

        return poppedElmt;
    }

    public int peep(int indxFromTop){
        Node cuurentNode = top;

        if(indxFromTop <= 0){
            System.out.println("Stack Underflow!!");
            return 0;
        }

        if(indxFromTop > length){
            System.out.println(" ");
            System.out.println("Stack Underflow!!");
            return 0;
        }

        int element = 0;

        for(int i=1;i<=indxFromTop;i++){
            element = cuurentNode.data;
            cuurentNode = cuurentNode.next;
        }


        return element;
    }


    public void change(int indxFromTop,int newElmt){

        Node cuurentNode = top;

        if(indxFromTop <= 0){
            System.out.println("Enter a valid index!!");
            return;
        }

        if(indxFromTop > length){
            System.out.println(" ");
            System.out.println("Enter a valid!!");
            return;
        }

      
        for(int i=1;i<indxFromTop;i++){
            cuurentNode = cuurentNode.next;
        }

        cuurentNode.data = newElmt;

    }




    public static void main(String[] args) {

        System.out.println(" ");

        DynamicStack ds = new DynamicStack();

        ds.push(12);
        ds.push(14);
        ds.push(15);
        ds.push(18);
        
        ds.change(5, 11);

        ds.display();

    }
}
