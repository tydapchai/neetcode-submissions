class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int sum = - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                for(int z = j + 1; z < nums.length; z++){
                    if(nums[z] + nums[j] == sum){
                       List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[z]);
                       Collections.sort(triplet);
                       set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}