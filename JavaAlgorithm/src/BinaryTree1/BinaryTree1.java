/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree1;

/**
 *
 * @author Mehedi Hassan
 */
public class BinaryTree1 {
    
    public TreeNode createNode(int x){
    TreeNode node = new TreeNode(x);
    node.left = null;
    node.right = null;
    return node;
    
    }
    
}
