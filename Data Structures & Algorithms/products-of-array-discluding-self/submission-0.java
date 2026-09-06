class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results = new int[nums.length];
        int infix = 1;
        for(int i = 0; i < n; i++){
            results[i] = infix;
            infix *= nums[i];
        }

        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            results[i] *= suffix;
            suffix *= nums[i];
        }
        return results;
    }
    
}
