#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int n = nums.size();
        if (n < 3) return result;

        // 1. Sắp xếp mảng tăng dần
        sort(nums.begin(), nums.end());

        // 2. Duyệt qua từng phần tử làm số thứ nhất
        for (int i = 0; i < n - 2; ++i) {
            // Nếu số nhỏ nhất > 0, tổng 3 số không thể bằng 0
            if (nums[i] > 0) break;

            // Bỏ qua giá trị trùng lặp cho vị trí đầu tiên
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Kỹ thuật Two Pointers
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.push_back({nums[i], nums[left], nums[right]});

                    // Bỏ qua các phần tử trùng lặp ở hai đầu
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Cần tổng lớn hơn
                } else {
                    right--; // Cần tổng nhỏ hơn
                }
            }
        }

        return result;
    }
};