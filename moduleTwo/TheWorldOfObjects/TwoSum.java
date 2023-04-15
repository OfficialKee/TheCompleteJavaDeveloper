import java.util.HashMap;
import java.util.Map;

public class  TwoSum {

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        twoSum(nums,9);

    }

    public static int[] twoSum(int[] nums, int target) {
        // created a map
        Map<Integer, Integer> map = new HashMap<>();
        // created a for loop
        for (int i = 0; i < nums.length; i++) {
            // assigned i to a readable variable
            int currentValue = nums[i];

            int solutionValue = target - currentValue;

            if (map.containsKey(solutionValue)) {
                return new int[] { map.get(solutionValue), i };
            } else {
                map.put(currentValue, i);
            }
        }
        return null;
    }
}
