package com.sanedge.java.BinaryIndexedTree.countofsmallernumberafterself;

import java.util.ArrayList;
import java.util.List;

class BinarySearchTreeNode {
    public int val;
    public int less; // count of members less than val
    public int count; // count of members equal val
    public BinarySearchTreeNode left, right;

    public BinarySearchTreeNode(int value) {
        val = value;
        less = 0;
        count = 1;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    private BinarySearchTreeNode root;

    public BinarySearchTree(int value) {
        root = new BinarySearchTreeNode(value);
    }

    private void freeTree(BinarySearchTreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            freeTree(root.left);
        }
        if (root.right != null) {
            freeTree(root.right);
        }
        root = null;
    }

    public void insert(int value, int[] numLessThan) {
        insert(root, value, numLessThan);
    }

    private void insert(BinarySearchTreeNode root, int value, int[] numLessThan) {
        if (value < root.val) { // left
            root.less++;
            if (root.left == null) {
                root.left = new BinarySearchTreeNode(value);
            } else {
                insert(root.left, value, numLessThan);
            }
        } else if (value > root.val) { // right
            numLessThan[0] += root.less + root.count;
            if (root.right == null) {
                root.right = new BinarySearchTreeNode(value);
            } else {
                insert(root.right, value, numLessThan);
            }
        } else {
            numLessThan[0] += root.less;
            root.count++;
            return;
        }
    }

    public void free() {
        freeTree(root);
    }
}

public class CountNumber {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> counts = new ArrayList<>();
        if (nums.length == 0) {
            return counts;
        }
        BinarySearchTree tree = new BinarySearchTree(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            int[] numLessThan = { 0 };
            tree.insert(nums[i], numLessThan);
            counts.add(0, numLessThan[0]);
        }

        tree.free();
        return counts;
    }
}
