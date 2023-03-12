package com.sanedge.java.BreathFirstSearch.populatenextrightpointer;

import java.util.LinkedList;
import java.util.Queue;

public class Next {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                if (prev != null) {
                    prev.next = node;
                }

                prev = node;

                if (node.left != null) {
                    q.offer(node.left);

                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }

        return root;
    }
}
