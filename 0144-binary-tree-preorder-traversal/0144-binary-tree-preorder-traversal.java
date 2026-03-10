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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> list = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                list.add(curr.val);
                curr = curr.right;
            }

            else{
                TreeNode lc = curr.left;
                while(lc.right != null && lc.right != curr){
                    lc = lc.right;
                }

                if(lc.right == null){
                    lc.right = curr;
                    list.add(curr.val);
                    curr = curr.left;
                }

                else{
                    lc.right = null;
                    curr = curr.right;
                }
            }
        }

        return list;

    }
}