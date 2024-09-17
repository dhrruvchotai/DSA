public class PostPreTree {
    
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

    public static Node root;

    static class BinaryTree{

        static int index = -1;

        public static Node buildTree(int nodes[]){

            index++;

            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        } 
    }

    public static void main(String[] args) {
        int preord[] = {1,2,3,4,5};
        int postord[] ={2,5,4,3,1};


    }
}
