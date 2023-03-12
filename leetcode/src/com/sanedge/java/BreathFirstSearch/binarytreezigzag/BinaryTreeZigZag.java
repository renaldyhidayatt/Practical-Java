package com.sanedge.java.BreathFirstSearch.binarytreezigzag;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigZag {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        search(root, 0, res);
        return res;
    }

    private void search(TreeNode root, int depth, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() < depth + 1) {
            res.add(new ArrayList<Integer>());
        }
        if (depth % 2 == 0) {
            res.get(depth).add(root.val);
        } else {
            res.get(depth).add(0, root.val);
        }
        search(root.left, depth + 1, res);
        search(root.right, depth + 1, res);
    }

}
