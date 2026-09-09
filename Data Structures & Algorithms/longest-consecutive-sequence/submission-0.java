class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set){
            if(!set.contains(num - 1)){
                int currentStreak = 1;
                while(set.contains(num + 1)){
                    currentStreak += 1;
                    num += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        } 
        return longestStreak;
        }
}
