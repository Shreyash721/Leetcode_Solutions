class MinStack {
    Stack<Integer> st;
    Stack<Integer> st1;

    public MinStack() {
        st=new Stack<>();
        //normal value insert krenge jise hm peek krke sahi value pta chal jaye ki current time par kaun si value stack me hai.
        st1=new Stack<>(); //sirf minimum store krega jisse. hm tutrant jaan paye ki minimum kitna hai currently stack me.
    }
    
    public void push(int value) {
        st.push(value);  // value to insert hi krenge
        if(st1.isEmpty() || value<st1.peek()) st1.push(value);
        // yo to khali hai st1 ya to value usme padi hui value se kam hai to updatebkrenge ki ab minimum badal chuka hai.
        else st1.push(st1.peek());
    }
    
    public void pop() {
        st.pop();
        st1.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return st1.peek(); //peek is minimum current value 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */