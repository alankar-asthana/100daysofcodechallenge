import java.util.*;

public class Solution {

public static boolean[] propogateGame(int leap, int[]game) {
        int n = game.length;
        boolean[] dp = new boolean[n];
        // First one is always valid because that's where we start (always a 0;)
        dp[0] = true;
        Queue<Integer> queue = new LinkedList<>(); // Keeps track of indexes
        queue.add(0);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            // Check if you can put a true in forward, backward and leapForward
            
            //Back 1;
            if(curr-1>=0 && game[curr-1]==0 && !dp[curr-1]) {
                dp[curr-1] = true;
                queue.add(curr-1);
            }
            //Forward 1
            if(curr+1<n && game[curr+1]==0 && !dp[curr+1]) {
                dp[curr+1] = true;
                queue.add(curr+1);
            }
            //leapForward
            if(curr+leap<n && game[curr+leap]==0 && !dp[curr+leap]){
                dp[curr+leap] = true;
                queue.add(curr+leap);
            }
        }
        return dp;   
    }
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWin = false;
        int n = game.length;
        boolean[] dp = propogateGame(leap, game);
        for(int i=0; i<n; i++){
            if(!dp[i]) continue;
            if(i == n-1 || i+leap >= n){
                canWin = true;
                break;
            }
        }
        
        return canWin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
