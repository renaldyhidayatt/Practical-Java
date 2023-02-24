package com.sanedge.java.BinarySearch.mycalender;

public class MyCalender {
    static class Event {
        int start;
        int end;
        Event left;
        Event right;

        public Event(int start, int end, Event left, Event right) {
            this.start = start;
            this.end = end;
            this.left = left;
            this.right = right;
        }

        public boolean insert(Event curr) {
            if (this.end > curr.start && curr.end > this.start) {
                return false;
            }

            if (curr.start < this.start) {
                if (this.left == null) {
                    this.left = curr;
                } else {
                    return this.left.insert(curr);
                }
            } else {
                if (this.right == null) {
                    this.right = curr;
                } else {
                    return this.right.insert(curr);
                }
            }

            return true;
        }

        
        
        
    }
    private Event root;
    
    public MyCalender() {
        root = null;
    }
    
    public boolean book(int start, int end) {
        Event curr = new Event(start, end, null, null);
        if (root == null) {
            root = curr;
            return true;
        }
        return root.insert(curr);
    }
}
