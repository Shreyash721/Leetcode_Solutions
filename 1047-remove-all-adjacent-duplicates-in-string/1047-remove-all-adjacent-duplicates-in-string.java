class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        Stack<Character> st1 = new Stack<>();

        while (!st.isEmpty()) {
            st1.push(st.pop());
        }

        String s1 = "";

        while (!st1.isEmpty()) {
            s1 = s1 + st1.pop();
        }

        return s1;
    }
}
