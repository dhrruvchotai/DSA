public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }    
    }

    public static void main(String[] args) {

        int arr[] = {50,23,12,9,75,99};

        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }

        inOrder(root);
        boolean isFound = serch(root, 9);

        System.out.println(" ");
        if(isFound) System.out.println("The value is in BST.");
        else System.out.println("The value is not in the BST.");
    }

    public static Node insert(Node root ,int val){
        
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val < root.data){
           root.left =  insert(root.left, val);
        }
        if(val > root.data){
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    public static boolean serch(Node root,int key){    

        if(root == null) return false;
        if(root.data == key) return true;

        if(key < root.data){
            return serch(root.left, key);
        }
        if(key > root.data){
            return serch(root.right, key);
        }

        return false;
    }
}
