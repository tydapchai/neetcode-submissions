public class Solution {
    public int Trap(int[] height) {
        if (height == null || height.Length < 3) return 0;

        int totalWater = 0;
        int n = height.Length;

        // Tìm vị trí cột cao nhất (đỉnh phân cách 2 phía)
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }

        // Lượt 1: Quét từ trái sang đỉnh (l, r cùng tiến sang phải)
        int l = 0;
        for (int r = 1; r <= maxIndex; r++) {
            if (height[r] < height[l]) {
                totalWater += height[l] - height[r];
            } else {
                l = r;
            }
        }

        // Lượt 2: Quét từ phải sang đỉnh (r, l cùng tiến sang trái)
        int rightBound = n - 1;
        for (int cur = n - 2; cur >= maxIndex; cur--) {
            if (height[cur] < height[rightBound]) {
                totalWater += height[rightBound] - height[cur];
            } else {
                rightBound = cur;
            }
        }

        return totalWater;
    }
}