import java.util.Scanner;

public class practice {
    public static int stairs(int n){
        //base case;
      //  int sum=0;
                if (n <= 1) {
                    return 1;
                }

                int[] dp = new int[n + 1];
                dp[1] = 1;
                dp[2] = 2;

                for (int i = 3; i <= n; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                    //System.out.println(dp[i]);
                }

                return dp[n];
            }



    //public static int jump(int input){
    //}
    public static void main(String[] args){
        int input=5;
    //    Scanner sc = new Scanner(System.in);
      //  input=sc.nextInt();
        System.out.println(stairs(input));

    }
}
