class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    results[0] = numbers[i];
                    results[1] = numbers[j];
                    return results;
                }
            }
        }
        return new int[]{};
    }
}
