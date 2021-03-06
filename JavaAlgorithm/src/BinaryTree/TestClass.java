package BinaryTree;

/**
 *
 * @author Mehedi Hassan
 */
public class TestClass {

    public static void main(String[] args) {
        Binary_Tree obj = new Binary_Tree();
        Tree_Node rootNode = obj.createNode(10);
        rootNode.left = obj.createNode(7);
        rootNode.right = obj.createNode(5);
        rootNode.left.left = obj.createNode(2);
        rootNode.left.right = obj.createNode(6);
        rootNode.left.right.left = obj.createNode(5);
        rootNode.left.right.right = obj.createNode(11);
        rootNode.right.right = obj.createNode(9);
        rootNode.right.right.left = obj.createNode(4);

        obj.preOrderTraversal(rootNode);
        System.out.println("\n");
        obj.inOrderTraversal(rootNode);
        System.out.println("\n");
        obj.postOrderTraversal(rootNode);

    }
}
