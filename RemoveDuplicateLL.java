public class RemoveDuplicateLL {
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

    public void removeDuplicate(){

        Node currNode = first;

        while(currNode.next != null){

            if(currNode.data == currNode.next.data){
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {
        RemoveDuplicateLL l1 = new RemoveDuplicateLL();

        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);

        l1.removeDuplicate();

        l1.printList();
    }
}
