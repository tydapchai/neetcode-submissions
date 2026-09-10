class Solution {
    public int maxArea(int[] heights) {
        int max = 1;
        for(int i = 0; i < heights.length;i++){
            for(int j = i + 1; j < heights.length; j++){
                int h = Math.min(heights[i],heights[j]);
                
                int w = j - i;
                int currentMax = h*w;
                if(currentMax > max){
                    max = currentMax;
                }
            }
        }
        return max;
    }
   
}
