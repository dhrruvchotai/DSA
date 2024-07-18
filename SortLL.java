import java.util.ArrayList;
import java.util.Arrays;
import org.w3c.dom.Node;

public class SortLL {

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

    public void converToArr(){

        ArrayList<Integer> arr = new ArrayList<Integer>();

        Node curr = first;

        while(curr.next != null){
            arr.add(curr.data);
        }

    }


    public static void main(String[] args) {
        SortLL l1 = new SortLL();

        l1.insertAtLast(0);
        l1.insertAtLast(8);
        l1.insertAtLast(1);
        l1.insertAtLast(4);
        l1.insertAtLast(7);

        l1.printList();
    }
}
