class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            int count[] = new int[26];
            int maxFre = 0;
            int length = 0;
            for(int j = 0; j < s.length(); j++){
               int index = s.charAt(j) - 'A';
               count[index]++;
               maxFre = Math.max(maxFre, count[index]);
                length = j - i + 1;
               if(length - maxFre <= k){
                maxLength = Math.max(length, maxLength);
               }else{
                break;
               }
            }
        }
        return maxLength;
    }
}
