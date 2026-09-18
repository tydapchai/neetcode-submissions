class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Khởi tạo tần suất cho s1 và cửa sổ đầu tiên có độ dài n1 trên s2
        for (int i = 0; i < n1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Kiểm tra cửa sổ đầu tiên
        if (Arrays.equals(s1Count, s2Count)) return true;

        for (int i = n1; i < n2; i++) {
            // Nạp ký tự mới vào bên phải
            s2Count[s2.charAt(i) - 'a']++;
            // Loại ký tự cũ ra khỏi bên trái (cách vị trí hiện tại n1 đơn vị)
            s2Count[s2.charAt(i - n1) - 'a']--;

            // So sánh 2 mảng tần suất (mảng 26 phần tử chạy tốn O(26) = O(1))
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}