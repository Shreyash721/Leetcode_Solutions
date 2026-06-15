class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        
        for (int x: nums)
        {
            int digit=0;
            while(x>0)
            {
                digit++;
                x/=10;
            }
        if(digit%2==0) c++;
        }
    return c;

    }
    
}