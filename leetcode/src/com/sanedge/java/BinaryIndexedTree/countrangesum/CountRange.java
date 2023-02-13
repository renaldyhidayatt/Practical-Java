package com.sanedge.java.BinaryIndexedTree.countrangesum;

class Node{
    public long val;
    public int cnt; // amount of the nodes
    public Node left, right;

    public Node(long v) {
        val = v;
        cnt = 1;
        left = null;
        right = null;
    }
}

class Tree{
    private Node root;
    
    public Tree(){
        root = null;
    }

    public void Insert(long val){
        Insert(root, val);
    }

    public int LessThan(long sum, int val){
        return LessThan(root, sum, val, 0);
    }

    private void Insert(Node root, long val){
        if(root == null){
            this.root = new Node(val);
        }

        root.cnt++;

        if(val < root.val){
            if(root.left == null){
                root.left = new Node(val);
            }else{
                Insert(root.left, val);
            }
        }else if (val > root.val){
            if (root.right == null) {
                root.right = new Node(val);
            } else {
                Insert(root.right, val);
            }
        }
    }

    private int LessThan(Node root, long sum, int val, int res){
        if(root == null){
            return res;
        }

        if(sum - root.val < val){
            res += (root.cnt - (root.left != null ? root.left.cnt : 0));
            return LessThan(root.left, sum, val, res);
        } else if(sum - root.val > val){
            return LessThan(root.right, sum, val, res);
        }else{
            return res + (root.right != null ? root.right.cnt : 0);
        }
    }

    private void freeTree(Node root){
        if(root == null){
            return;
        }

        if(root.left != null){
            freeTree(root.left);
        }
        if (root.right != null) {
            freeTree(root.right);
        }

        root = null;
    }
}

public class CountRange {
    public int countRangeSum(int[] nums, int lower, int upper){
        Tree tree = new Tree();

        tree.Insert(0);
        long sum = 0;
        int res = 0;

        for(int n : nums){
            sum += n;
            int lcnt = tree.LessThan(sum, lower);
            int hcnt = tree.LessThan(sum, upper + 1);
            res += (hcnt - lcnt);
            tree.Insert(sum);
        }

        return res;
    }
}
