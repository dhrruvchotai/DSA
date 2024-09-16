public class SymmetricBST {

    static class Node{
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
        
    }
     public static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        return (left.data == right.data) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
