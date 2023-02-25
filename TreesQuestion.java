package Now;

class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreesQuestion {
    
    static Node root;
    
    public static void main(String[] args) {
        
        // Create a binary tree
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        // Traverse the binary tree in preorder
        System.out.print("Preorder traversal of binary tree: ");
        preorderTraversal(root);
        
        // Traverse the binary tree in inorder
        System.out.print("\nInorder traversal of binary tree: ");
        inorderTraversal(root);
        
        // Traverse the binary tree in postorder
        System.out.print("\nPostorder traversal of binary tree: ");
        postorderTraversal(root);
    }
    
    // Preorder traversal of binary tree
    public static void preorderTraversal(Node node) {
        if (node == null)
            return;
        
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    
    // Inorder traversal of binary tree
    public static void inorderTraversal(Node node) {
        if (node == null)
            return;
        
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
    
    // Postorder traversal of binary tree
    public static void postorderTraversal(Node node) {
        if (node == null)
            return;
        
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}

