public class practice2 {
    public static int minCostClimbingStairs(int[] cost) {
                        int n = cost.length;
                        //creating an array to store the cost at nth step
                int[] test = new int[n];
                test[0] = cost[0];
                test[1] = cost[1];

                for(int i = 2; i < n; i++) {
                    test[i] = cost[i] + Math.min(test[i - 1], test[i - 2]);
                }

                return Math.min(test[n - 1], test[n - 2]);
            }

public static void main(String[] args){
        int[] check={20,10,15,25,5,45};
       System.out.println(minCostClimbingStairs(check));
    }
}
