package Easy.twosum;

import java.io.IOError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(target - nums[i])) {
                return new int[] { myMap.get(target - nums[i]) };
            }
            myMap.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main() {
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twosum(nums, 9)));
    }
}
