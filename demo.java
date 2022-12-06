public boolean wordBreak(String s, ListString wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[n]=true;
        SetString dict=new HashSet(wordDict);
        for(int i=n-1;i=0;i--) {
            for(int j=i+1;!dp[i] && j=n;j++) { 
                dp[i] = dp[j] & dict.contains(s.substring(i,j));
            }
        }
        return dp[0];   
    }