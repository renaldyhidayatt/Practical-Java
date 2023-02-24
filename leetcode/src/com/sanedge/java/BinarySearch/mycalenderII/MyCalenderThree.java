package com.sanedge.java.BinarySearch.mycalenderII;

public class MyCalenderThree {
    static class SegmentTree{
        int start, end, count;
        SegmentTree left, right;

        public SegmentTree(int start, int end) {
            this.start = start;
            this.end = end;
            this.count = 0;
            this.left = null;
            this.right = null;
        }

        public void book(int start, int end, int[] maxHeight){
            if(start == end){
                return;
            }
            if(start == this.start && end == this.end){
                count++;
                maxHeight[0]= Math.max(maxHeight[0], count);
                
                if(left == null){
                    return;
                }
            }

            if(left == null){
                if(start == this.start){
                    left = new SegmentTree(start, end);
                    right = new SegmentTree(end, this.end);
                    left.book(start, end, maxHeight);
                    return;
                }
                left = new SegmentTree(this.start, start);
                right = new SegmentTree(start, this.end);
                right.book(start, end, maxHeight);
                return;
            }

            if(start >= right.start){
                right.book(start, end, maxHeight);
            }else if(end <= left.end){
                left.book(start, end, maxHeight);
            }else{
                left.book(start, left.end, maxHeight);
            right.book(right.start, end, maxHeight);
            }
        }
    };

    SegmentTree st;
    int maxHeight;

    public MyCalenderThree() {
        st = new SegmentTree(0, 1000000000);
        maxHeight = 0;
    }
    
    public int book(int start, int end) {
        st.book(start, end, new int[]{maxHeight});
        return maxHeight;
    }
}
