package Medium.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int ls = nums.length;

        for (int i = 0; i < ls - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = ls - 1;
            while (j < k) {
                int curr = nums[i] + nums[j] + nums[k];
                if (curr == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (curr < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(threesum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }
}
