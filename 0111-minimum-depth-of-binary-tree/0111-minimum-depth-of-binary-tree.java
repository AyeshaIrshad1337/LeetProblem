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
    public int minDepth(TreeNode root) {
    if(root==null) return 0;
        int lt=minDepth(root.left);
        int rt=minDepth(root.right);
        if(lt==0 | rt==0) return 1+Math.max(lt,rt);
        return 1+Math.min(lt,rt);
    }
    
}