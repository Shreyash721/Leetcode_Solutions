class Solution {
    public int minimumCost(int[] cost) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int net=0;
        for(int c:cost){
            pq.add(c);
        }
        if(pq.size()>=3){
            while(pq.size()>=3){
                
                int x=pq.remove();
                int y=pq.remove();
                
                net=net+x+y;
                
                pq.remove();
                
            }
        }

        while(!pq.isEmpty()) net=net+pq.remove();

        return net;
    }
}