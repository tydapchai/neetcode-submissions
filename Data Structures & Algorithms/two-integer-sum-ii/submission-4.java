class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];
       
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[right] + numbers[left];
            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else if(sum == target){
                results[0] = left + 1;
                results[1] = right + 1;
                return results;
            }
        }
        return new int[]{};
    }
}
