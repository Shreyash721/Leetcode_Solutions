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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        if(root==null) return arr;
        
        arr.addAll(postorderTraversal(root.left));
        arr.addAll(postorderTraversal(root.right));
        arr.add(root.val);


        return arr;

    }
}