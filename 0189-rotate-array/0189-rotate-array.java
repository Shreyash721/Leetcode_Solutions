class Solution {
        public void reverse(int[] arr,int st,int end)
        {
            
            int i=st;
            int j=end;
            while(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }

        }
    public void rotate(int[] nums, int k) 
    {     
        int n=nums.length;  
        k = k % n;  
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
       
        
    }
}