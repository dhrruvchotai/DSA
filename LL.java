    public class LL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node first = null;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(first == null){
            first = newNode;
            return;
        }

        Node currentNode = first;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    public void deleteFirst(){
        if(first == null){
            System.out.println(" ");
            System.out.println("Linked List is Empty!!");
            return;
        }
        first = first.next;
    }

    public void deleteLast(){
        if(first == null){
            System.out.println(" ");
            System.out.println("Linked List is Empty!!");
        }

        if(first.next == null){
            first = null;
            return;
        }
        Node secondLast = first;
        Node last = first.next;

        while(last.next != null){
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    public void insertOrd(int x){
        Node newNode = new Node(x);

        if(first == null || newNode.data <= first.data){
            newNode.next = first;
            first = newNode;
            return;
        }

        Node currentNode = first;

        while(currentNode.next != null && newNode.data >= currentNode.next.data){
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void deleteFromElmt(int x){
        Node currNode = first;

        if(first == null){
            System.out.println(" ");
            System.out.println("Linked List Is Empty!!");
            return;
        }

        if(currNode.data == x){
            first = currNode.next;
            return;
        }

        while(currNode.next.data!=x && currNode.next.next != null){
            currNode = currNode.next; 
        }

        currNode.next = currNode.next.next;
    }
    
    public void printList(){

        if(first == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node cuurrentNode = first;
        
        while(cuurrentNode != null){
            System.out.print(cuurrentNode.data + " -> ");
            cuurrentNode = cuurrentNode.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    public static void main(String[] args) {

        LL list = new LL();
    
        list.insertAtFirst(1);
        list.insertAtLast(2);
        list.insertAtLast(7);
        list.insertAtLast(8);

        list.insertOrd(3);
        list.printList();
    }
}
