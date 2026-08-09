class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double sum=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        
        for(int i=0;i<prices.length;i++){
            st.push(prices[i]);
        }
        
        for(int i=0;i<discounts.length;i++){
            st1.push(discounts[i]);
        }


        while(!st.isEmpty() && !st1.isEmpty()){
            double a=st.pop();
            double d=st1.pop();

            sum=sum+(a*(100-d)/100);
        }

        while(!st.isEmpty()){
            double p= st.pop();
            sum=sum+p;
        }

        return sum;
    }
}