package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 6, 12, 13, 3, 8, 15, 16 };
        int[] result = TwoSum(nums, 20);
        System.out.printf("Result is [%d, %d]%n", result[0], result[1]);
    }

    static int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };


            int compliment = target - nums[i];
            if (!map.containsKey(compliment))
                map.put(compliment, i);
            //Console.WriteLine($"Number --> {nums[i]}, adding Key={compliment} at value={i}");
            System.out.printf("Number --> %d, adding Key=%d at value=%d %n", nums[i], compliment, i);
        }

        return null;
    }
}
