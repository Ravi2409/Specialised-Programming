public class dp2
{
    public static int max_Profit(int[] prices) {
    if (prices.length == 0) return 0;
    int ans=0;
    int[] profit = new int[prices.length];
    for (int i = 0; i < profit.length; i++) {
        //initalizing the profit array with zero
        profit[i] = 0;
    }
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
        //first idenifying the minimum number from array to identify buying price
        if (prices[i] < min) min = prices[i];
        System.out.println(min);
            profit[i] = Math.max(profit[i - 1], prices[i] - min);
            //System.out.println(profit[i]);
        }
        //System.out.println(profit.length);
    ans=profit[prices.length - 1];


    return ans;
}
        public static void main(String[] args){
        int[] inp={7,6,4,3,1};
        int ans=max_Profit(inp);
        System.out.println(ans);
        }

}