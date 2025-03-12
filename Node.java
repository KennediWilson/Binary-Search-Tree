public class Node {
    // The value stored in the node
    String key; //name
    
    // Reference to the left child node
    Node left; //left child
    
    // Reference to the right child node
    Node right;//right child

    // Constructor to initialize the node with a value
    public Node(String item) {
        key = item; 
        left = right = null; 
    }
}