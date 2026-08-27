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

    private boolean isSorted(ArrayList<Integer> arr) {
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)) return false;
        }

      return true;
    }
    private void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();

        inorder(root,arr);

        return isSorted(arr);
        
    }
}