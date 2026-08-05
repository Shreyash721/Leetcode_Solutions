class Solution {
    public void reverseString(char[] s) {
       /* int i=0;
        int j=s.length-1;
        while(i<=j){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;  
        }*/

        Stack<Character> st = new Stack<>();
int i = 0;

while(i != s.length){
    st.push(s[i]);     
    i++;
}

int tos = st.size();
i = 0;

while(tos > 0){
    s[i] = st.pop();    
    i++;
    tos--;
}
    }
}