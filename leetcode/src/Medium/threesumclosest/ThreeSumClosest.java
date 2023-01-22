package Medium.threesumclosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int ls = nums.length;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < ls - 2; i++) {
            int j = i + 1;
            int k = ls - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - temp) < Math.abs(target - res)) {
                    res = temp;
                }
                if (temp < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
    }
}
