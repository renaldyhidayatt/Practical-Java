import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        TwoSum sum = new TwoSum();
        int[] nums = { 2, 3, 4 };

        sum.twoSum(nums, 3);
    }

    // example in leetcode book
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x), i };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
