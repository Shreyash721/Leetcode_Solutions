//                        //Method-1(TLE)

// class Solution {
//     private boolean isPalindrome(String s){
//         int i=0;
//         int j=s.length()-1;
//         while(i<=j){
//             if(s.charAt(i)!=s.charAt(j)) return false;
//             i++;
//             j--;
//         }


//         return true;

//     }
//     public String longestPalindrome(String s) { 
//         String st="";
//         int max=0;
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             String str="";
//             for(int j=i;j<s.length();j++){
//                 char ch=s.charAt(j);
//                 str=str+ch;
//                 if(isPalindrome(str)){
//                     if(str.length()>=max){
//                         st=str;
//                         max=str.length();
//                     }
//                 }
//             }
//         } 

//         return st;
//     }
// }


                     // chatGPT solution:


class Solution {
    public String longestPalindrome(String s) {
        int start = 0, max = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);       // odd
            int len2 = expand(s, i, i + 1);   // even
            int len = Math.max(len1, len2);

            if (len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + max);
    }

    private int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}

