class Solution {
    public int val(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
            
        }
    }
    public int romanToInt(String s)
    {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            char nx=s.charAt(i+1);
            int num=val(ch);
            int num2=val(nx);
            if(num==num2)
            {
                sum=sum+num;
            }
            else if(num<num2)
            {
                sum=sum-num;
            }
            else
            {
                sum=sum+num;
            }
            
        }
        int lst=val(s.charAt(s.length()-1));
        return sum+lst;
    }
}