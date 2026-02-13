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
class Solution {

    public class TreeInfo{
        int ht;
        int dm;

        TreeInfo(int ht , int dm){
            this.ht = ht;
            this .dm = dm;
        }
    }

    public TreeInfo diameter(TreeNode root){
        if(root == null){
            
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int height = Math.max(left.ht , right.ht)+1;

        int d1 = left.dm;
        int d2 = right.dm;
        int d3 = left.ht + right.ht ;

        int diameter = Math.max(Math.max(d1 , d2), d3);

        TreeInfo newInfo = new TreeInfo(height, diameter);

        return newInfo;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        
        TreeInfo ans = diameter(root);

        return ans.dm;

    }
}