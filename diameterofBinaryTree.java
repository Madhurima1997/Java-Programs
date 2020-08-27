/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 //Diameter of a tree is the longest path between two nodes
 
class Solution {
    public int height(TreeNode root){
        if(root == null)
            return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);
        int h=(lheight>rheight)?lheight+1:rheight+1;
        
        return h;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int lheight=height(root.left);//height of left tree
        int rheight=height(root.right);//height of right tree
        int ldiam=diameterOfBinaryTree(root.left);//diameter of left subtree
        int rdiam=diameterOfBinaryTree(root.right);//dimeter of right subtree
        
        //result is maximum of diameter if passing through root or diameter if not passing through root
        int res=Math.max(lheight+rheight,Math.max(ldiam,rdiam));
        return res;
    }
}
