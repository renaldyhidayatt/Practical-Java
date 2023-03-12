package com.sanedge.java.BreathFirstSearch.invertbinarytree;

public class Invert {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        return root;
    }
}
