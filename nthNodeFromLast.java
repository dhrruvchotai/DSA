public class nthNodeFromLast {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;   
        }
    }

    Node first = null;

    
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

    // public Node deleteNthFromLast(Node first,int n){

    // }

    public static void main(String[] args) {
        nthNodeFromLast nfl = new nthNodeFromLast();
        nfl.insertAtLast(0);
        nfl.insertAtLast(1);
        nfl.insertAtLast(2);
        nfl.insertAtLast(3);


    }
}
