class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    results[0] = i + 1;
                    results[1] = j + 1;
                    return results;
                }
            }
        }
        return new int[]{};
    }
}
