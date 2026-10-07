class Solution {
    public int minBitFlips(int start, int goal) {
        int n=start^goal;
        int cnt=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') cnt++;
        }

        return cnt;
    }
}