

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map lưu: Key = giá trị số (nums[i]), Value = chỉ số index (i)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Số còn thiếu để cộng lại bằng target

            // Nếu số còn thiếu đã nằm trong map, trả về ngay vị trí của 2 số
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Nếu chưa có, lưu số hiện tại cùng index của nó vào map
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}