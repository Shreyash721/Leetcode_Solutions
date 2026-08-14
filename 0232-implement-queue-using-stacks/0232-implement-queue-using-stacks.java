class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st2;

    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        shift();
        return st2.pop();
    }

    public int peek() {
        shift();
        return st2.peek();
    }

    public boolean empty() {
        return st.isEmpty() && st2.isEmpty();
    }

    private void shift() {
        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
    }
}