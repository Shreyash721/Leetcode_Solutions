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
    private void inorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root==null) return;

        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<TreeNode> arr=new ArrayList<>();

        inorder(root,arr);

        Collections.reverse(arr);

        int sum=arr.get(0).val;
        if(arr.size()>0){
            ans.add(arr.get(0).val);
            for(int i=1;i<arr.size();i++){
                  sum+=arr.get(i).val;
                  ans.add(sum);
        }
        }

        for(int i=0;i<ans.size();i++){
            arr.get(i).val=ans.get(i);
        }

        Collections.reverse(arr);

        return root;
    }
}