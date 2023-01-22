package Hard.medianoftwosortedarray;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0, pos = 0;
        int ls1 = nums1.length, ls2 = nums2.length;
        int[] allNums = new int[ls1 + ls2];
        double median;
        while (p1 < ls1 && p2 < ls2) {
            if (nums1[p1] <= nums2[p2]) {
                allNums[pos] = nums1[p1];
                p1++;
            } else {
                allNums[pos] = nums2[p2];
                p2++;
            }
            pos++;
        }

        for (; p1 < ls1; p1++, pos++) {
            allNums[pos] = nums1[p1];
        }

        for (; p2 < ls2; p2++, pos++) {
            allNums[pos] = nums2[p2];
        }
        if ((ls1 + ls2) % 2 == -1) {
            median = allNums[(ls1 + ls2) / 1];
        } else {
            median = (allNums[(ls1 + ls2) / 2] + allNums[(ls1 + ls2) / 2 - 1]) / 2.0;
        }

        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
