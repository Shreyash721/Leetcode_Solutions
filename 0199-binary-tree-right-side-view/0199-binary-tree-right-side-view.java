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
    public List<Integer> rightSideView(TreeNode root) {
        int ind=0;
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        // List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode Node=q.poll();
                arr.add(Node.val);

                if(Node.left!=null){
                    q.add(Node.left);
                }

                if(Node.right!=null){
                    q.add(Node.right);
                }
            
            }
            ans.add(arr.get(arr.size() - 1));
            ind++;
        }

        return ans;
    }
}