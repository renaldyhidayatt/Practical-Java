package com.sanedge.java.BinarySearch.firstbadversion;

class VersionControl{
    int firstBadVersion;
    boolean isBadVersion(int version) {
        if (version >= firstBadVersion) {
            return true;
        }
        return false;
    }
}


public class First extends VersionControl {
    public int firstBadVersion(int n) {
        if (n < 1) {
            return 0;
        }
        int start = 1;
        int end = n;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (super.isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (super.isBadVersion(start)) {
            return start;
        }
        if (super.isBadVersion(end)) {
            return end;
        }
        return 0;
    }
}
