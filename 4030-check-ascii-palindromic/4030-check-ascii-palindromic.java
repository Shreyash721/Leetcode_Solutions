class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder st= new StringBuilder();
        for(char c:s.toCharArray()){
            int ch=c;
            for(int i=7;i>=0;i--){
                st.append((ch>>i)&1);
            }
        }

        int i=0;
        int j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
            
        }
    }
