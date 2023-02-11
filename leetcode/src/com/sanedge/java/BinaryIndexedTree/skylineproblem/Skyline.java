package com.sanedge.java.BinaryIndexedTree.skylineproblem;

import java.util.*;

public class Skyline {
    private final int LEFTSIDE = 1;
    private final int RIGHTSIDE = 2;

    class Point {
        int xAxis;
        int side;
        int index;

        Point(int xAxis, int side, int index) {
            this.xAxis = xAxis;
            this.side = side;
            this.index = index;
        }
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        if (buildings.length == 0) {
            return res;
        }
        List<Point> allPoints = new ArrayList<>();
        BinaryIndexedTree bit = new BinaryIndexedTree();
        for (int i = 0; i < buildings.length; i++) {
            allPoints.add(new Point(buildings[i][0], LEFTSIDE, i));
            allPoints.add(new Point(buildings[i][1], RIGHTSIDE, i));
        }
        Collections.sort(allPoints, (p1, p2) -> {
            if (p1.xAxis == p2.xAxis) {
                return Integer.compare(p1.side, p2.side);
            }
            return Integer.compare(p1.xAxis, p2.xAxis);
        });
        bit.Init(allPoints.size());
        Map<Point, Integer> kth = new HashMap<>();
        for (int i = 0; i < allPoints.size(); i++) {
            kth.put(allPoints.get(i), i);
        }
        for (int i = 0; i < allPoints.size(); i++) {
            Point pt = allPoints.get(i);
            if (pt.side == LEFTSIDE) {
                bit.Add(kth.get(new Point(buildings[pt.index][1], RIGHTSIDE, pt.index)), buildings[pt.index][2]);
            }
            int currHeight = bit.Query(kth.get(pt) + 1);
            if (res.isEmpty() || res.get(res.size() - 1).get(1) != currHeight) {
                if (!res.isEmpty() && res.get(res.size() - 1).get(0) == pt.xAxis) {
                    res.get(res.size() - 1).set(1, currHeight);
                } else {
                    List<Integer> point = new ArrayList<>();
                    point.add(pt.xAxis);
                    point.add(currHeight);
                    res.add(point);
                }
            }
        }
        return res;
    }

    class BinaryIndexedTree {
        private int[] tree;
        private int capacity;

        public void Init(int capacity) {
            this.tree = new int[capacity + 1];
            this.capacity = capacity;
        }

        public void Add(int index, int val) {
            for (; index > 0; index -= index & -index) {
                tree[index] = Math.max(tree[index], val);
            }
        }

        public int Query(int index) {
            int sum = 0;
            for (; index <= capacity; index += index & -index) {
                sum = Math.max(sum, tree[index]);
            }
            return sum;
        }
    }
}
