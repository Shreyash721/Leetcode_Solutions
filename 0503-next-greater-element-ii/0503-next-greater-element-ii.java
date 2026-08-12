class Solution {
    /*public int[] nextGreaterElements(int[] nums) {
  
        int [] arr= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=-1;

            for(int j=1;j<nums.length;j++){

                int num=(i+j)%nums.length;

                if(nums[num]>nums[i]){
                    arr[i]= nums[num];
                    break;
                }
            }
        }

        return arr;*/

    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] nge=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            st.push(nums[i]);
        }

        for(int i=n-1; i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()) st.pop();
            if(st.isEmpty()) nge[i]=-1;
            else{
                nge[i]=st.peek();
            }

            st.push(nums[i]);
        }
     return nge;
    }
}