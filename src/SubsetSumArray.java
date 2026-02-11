import java.util.Scanner;

public class SubsetSumArray {
    public static void main(String[] args){
/*
        Input: arr = {3, 34, 4, 12, 5, 2}, sum = 9
        Output: true
        Explanation: Subset {4, 5} or {3, 4, 2} adds up to 9.
*/
/*      int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
*/
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int[] arr=new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        int sum= sc.nextInt();

        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialize: sum 0 is always possible
        for (int i = 0; i <= n; i++) {
             dp[i][0] = true;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= sum; j++) {
            if (arr[i - 1] <= j) {
               dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            } else {
               dp[i][j] = dp[i - 1][j];
              }
          }
        }
      // print
      System.out.println(dp[6][9]);

    }
}

