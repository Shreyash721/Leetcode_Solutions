// class MedianFinder {

//     ArrayList<Integer> arr;
//     public MedianFinder() {
//         arr=new ArrayList<>();
//     }
//     public void addNum(int num) {
//         arr.add(num);
//     }
    
//     public double findMedian() {
//         Collections.sort(arr);
//         int n=arr.size();
//         if(n%2==0){
//             return ((double)arr.get(n/2)+arr.get(n/2-1))/2.0;
//         }
//         else{
//             return arr.get(n/2);
//         }

//     }
// }

// /**
//  * Your MedianFinder object will be instantiated and called as such:
//  * MedianFinder obj = new MedianFinder();
//  * obj.addNum(num);
//  * double param_2 = obj.findMedian();
//  */



//. METHOD - 2 (optimal approach)

class MedianFinder {

    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max; 

    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(max.size()==0 || max.peek()>num) max.add(num);
        else min.add(num);

        if(min.size()==max.size()+2) max.add(min.remove());
        if(max.size()==min.size()+2) min.add(max.remove());

    }

    public double findMedian() {

        if(max.size()==min.size()) return (double)(max.peek()+min.peek())/2.0;
        else if(min.size()==max.size()+1) return min.peek();
        else return max.peek();
    }
}

      




 