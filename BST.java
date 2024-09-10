public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }    
    }

    public static void main(String[] args) {

        int arr[] = {50,23,12,9,75,99};

        Node root = null;

        for(int i=0;i<arr.length;i++){
            root = insert(root, arr[i]);
        }

        // inOrder(root);
        // boolean isFound = serch(root, 9);

        // System.out.println(" ");
        // if(isFound) System.out.println("The value is in BST.");
        // else System.out.println("The value is not in the BST.");


        delete(root,99);
        System.out.println(" ");
        System.out.println("After deleting 23 : ");
        inOrder(root);
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

    public static Node delete(Node root,int key){

        if(root == null){
            System.out.println("Tree is empty.");
            return null;
        }

        if(root.left.data == key){
            Node rightNode = root.left.right;

            if(rightNode == null){
                root.left = root.left.left;
                return root;
            }

            while(rightNode.left != null){
                rightNode = rightNode.left;
            }
            
            rightNode.left = root.left.left;
            root.left = root.left.right;
        }

        else if(root.right.data == key){
            Node rightNode = root.right.right;

            while(rightNode.left != null){
                rightNode = rightNode.left;
            }

            rightNode.left = root.right.left;
            root.right = root.right.right;
        }

        if(key < root.data){
            delete(root.left, key);
        }
        if(key > root.data){
            delete(root.right, key);
        }

        return root;
    }
}
