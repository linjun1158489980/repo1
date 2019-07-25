package shixi7_20;

public class minDistance {


    public int minDistance(String word1, String word2) {
        int n1 = word1.length(),n2 = word2.length();
        int maxC = 0;
        int[][] dp = new int[n1+1][n2+1];
        for(int i = 0;i < n1;i++){
            for(int j = 0;j < n2;j++){
                if(word1.charAt(i) == word2.charAt(j))
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                else dp[i + 1][j + 1] = Math.max(dp[i + 1][j],dp[i][j+1]);
                maxC = Math.max(maxC,dp[i + 1][j + 1]);
            }
        }
        return n1 + n2 - 2 * maxC;
    }

    public static void main(String[] args) {
        minDistance m=new minDistance();
        int s=m.minDistance("sea","eat");
        System.out.println(s);
    }
}
