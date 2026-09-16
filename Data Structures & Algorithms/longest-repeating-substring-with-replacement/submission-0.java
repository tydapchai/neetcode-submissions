class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Tăng tần suất ký tự tại con trỏ right
            char rightChar = s.charAt(right);
            count[rightChar - 'A']++;

            // 2. Cập nhật tần suất của ký tự xuất hiện nhiều nhất trong cửa sổ
            maxFreq = Math.max(maxFreq, count[rightChar - 'A']);

            // 3. Số ký tự cần thay thế = (độ dài cửa sổ) - maxFreq
            // Nếu vượt quá k, ta phải co cửa sổ lại từ bên trái
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
            }

            // 4. Cửa sổ hiện tại hợp lệ, cập nhật độ dài tối đa
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}