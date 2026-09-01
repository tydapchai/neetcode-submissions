import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        
        // 1. Sắp xếp mảng
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Tối ưu: Số đầu tiên > 0 thì tổng không thể = 0
            if (nums[i] > 0) break;

            // Bỏ qua giá trị mở đầu bị trùng
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // 2. Hai con trỏ
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Bỏ qua các số trùng nhau ở 2 đầu con trỏ
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Cần tổng lớn hơn
                } else {
                    right--; // Cần tổng nhỏ hơn
                }
            }
        }

        return results;
    }
}