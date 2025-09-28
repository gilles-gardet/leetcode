package twosum;

import java.util.HashMap;

@SuppressWarnings("java:S1220")
public class Question {
    /**
     * First solution
     */
    public int[] twoSumMem(final int[] nums, final int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * Optimization
     */
    public int[] twoSumSpeed(final int[] nums, final int target) {
        final var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final var complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
