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


// IMPORTANT CODE FOR Validation as it check left subtree and rightsubtree:


// class Pair {
//     int max;
//     int min;

//     Pair(int max, int min) {
//         this.max = max;
//         this.min = min;
//     }
// }


// class Solution {
//     static boolean flag;

//     public boolean isValidBST(TreeNode root){
//         flag = true;
//         maxMin(root);
//         return flag;
//     }

//     Pair maxMin(TreeNode root) {
//         if (root == null)
//             return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

//         Pair lst = maxMin(root.left);
//         Pair rst = maxMin(root.right);

//         int max = Math.max(root.val, Math.max(lst.max, rst.max));
//         int min = Math.min(root.val, Math.min(lst.min, rst.min));

//         if (lst.max >= root.val || rst.min <= root.val)
//             flag=false;

//         return new Pair(max, min);
//     }
// }
