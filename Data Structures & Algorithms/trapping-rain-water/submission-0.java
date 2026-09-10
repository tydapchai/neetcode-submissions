class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        int waterAmount = 0;
        while(left < right){
            if(maxLeft < maxRight){
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                waterAmount += Math.max(0, maxLeft - height[left]);
            }else{
                right--;
                maxRight = Math.max(maxRight, height[right]);
                waterAmount += Math.max(0, maxRight - height[right]);

            }
        }
        return waterAmount;
    }
}
