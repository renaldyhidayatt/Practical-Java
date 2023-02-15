package com.sanedge.java.BinarySearch.countreenodes;

import java.util.LinkedList;
import java.util.Queue;

public class Count {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            val = x;
        }
    }

    public int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int curNum = 1, nextLevelNum = 0, res = 1;

        while(!queue.isEmpty()){
            if(curNum > 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                    nextLevelNum++;
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    nextLevelNum++;
                }
        
                curNum--;
            }

            if (curNum == 0) {
                res += nextLevelNum;
                curNum = nextLevelNum;
                nextLevelNum = 0;
            }
        }

        return res;

    }
}
