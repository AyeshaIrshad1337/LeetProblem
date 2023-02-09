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
    public int maxDepth(TreeNode root) {
   if(root==null) return 0;
        int height=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int itr = q.size();
            height++;
            while(itr-- >0){
                TreeNode tmp = q.poll();
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
            }
        }
        return height;
    }
}