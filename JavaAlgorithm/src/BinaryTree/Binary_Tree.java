package BinaryTree;

/**
 *
 * @author Mehedi Hassan
 */
public class Binary_Tree {

    Tree_Node createNode(int value) {
        Tree_Node node = new Tree_Node(value);
        return node;
    }

    public void preOrderTraversal(Tree_Node node) {

        System.out.println(node.data);
        if (node.left != null) {
            preOrderTraversal(node.left);
        }
        if (node.right != null) {
            preOrderTraversal(node.right);
        }

    }

  
    

    public void inOrderTraversal(Tree_Node node) {

        if (node.left != null) {
            inOrderTraversal(node.left);
        }
        System.out.println(node.data);

        if (node.right != null) {
            inOrderTraversal(node.right);
        }

    }

    public void postOrderTraversal(Tree_Node node) {

        if (node.left != null) {
            postOrderTraversal(node.left);
        }
        if (node.right != null) {
            postOrderTraversal(node.right);
        }
        System.out.println(node.data);

    }

}
