class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Tìm thấy đáy mới rẻ hơn để mua vào trong tương lai
                minPrice = prices[i];
            } else {
                // Nếu bán ở ngày hôm nay thì so sánh lãi với kỷ lục cũ
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}