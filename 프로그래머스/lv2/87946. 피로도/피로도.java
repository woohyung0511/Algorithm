class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        boolean[] visit = new boolean[dungeons.length];
        
        answer = dfs(dungeons, visit, k, 0);
        
        return answer;
    }
    
    public int dfs(int[][] dungeons, boolean[] visit, int k, int count) {
        int maxCount = count;
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && k >= dungeons[i][0]) {
                visit[i] = true;
                int result = dfs(dungeons, visit, k - dungeons[i][1], count + 1);
                maxCount = Math.max(maxCount, result);
                visit[i] = false;
            }
        }
        
        return maxCount;
    }
}
